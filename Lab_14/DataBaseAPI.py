import configparser
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, jsonify, request

application = Flask(__name__)

config = configparser.ConfigParser()
application.config['SQLALCHEMY_DATABASE_URI']='mysql+mysqlconnector://root:123456@127.0.0.1:3306/iot-db-test'

application.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

mysql = SQLAlchemy()
mysql.init_app(application)


class Machines(mysql.Model):
    __tablename__ = 'iot'
    id = mysql.Column(mysql.Integer, primary_key=True)
    model = mysql.Column(mysql.String, nullable=False)
    weight = mysql.Column(mysql.Integer, nullable=False)
    fuel = mysql.Column(mysql.Integer, nullable=False)

    def __repr__(self):
        return '<Machines (%s, %s) >' % (self.model, self.weight)


@application.route("/")
def hello():
    return "Hello World!"


@application.route('/machines', methods=['POST'])
def create_machines():
    id = request.get_json()["id"]
    model = request.get_json()["model"]
    weight = request.get_json()["weight"]
    fuel = request.get_json()["fuel"]

    curr_session = mysql.session

    machines = Machines(id=id,  model=model, weight=weight, fuel=fuel)
    try:
        curr_session.add(machines)
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    #machines_id = machines.id
    data = Machines.query.filter_by(id=machines.id).first()

    #config.read('machines_db.config')
    print (data)
    result = [" Machines"]

    return "Machines"



@application.route('/machines', methods=['GET'])
def get_machines():
    data = Machines.query.all()

    data_all = []

    for machines in data:
        data_all.append([machines.id, machines.model, machines.weight, machines.fuel])

    return jsonify(machines=data_all)


@application.route('/machines', methods=['PATCH'])
def update_machines():
    global machines
    machines_id = request.get_json()["id"]
    weight = request.get_json()["weight"]
    model = request.get_json()["model"]
    fuel = request.get_json()["fuel"]
    curr_session = mysql.session

    try:
        good = Machines.query.filter_by(id=machines_id).first()
        good.weight = weight
        good.model = model
        good.fuel=fuel
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    machines_id = machines.id
    data = Machines.query.filter_by(id=machines_id).first()

    config.read('goods_db.config')

    result = [data.model, data.weight, data.fuel]

    return jsonify(session=result)


@application.route('/machines/<int:good_id>', methods=['DELETE'])
def delete_machines(machines_id):
    curr_session = mysql.session

    Machines.query.filter_by(id=machines_id).delete()
    curr_session.commit()
    return get_machines()


if __name__ == "__main__":
    application.run(debug=True)







