package edu.eci.cvds;

import java.util.ArrayList;

public class Registry {

public ArrayList<Person> personasRegistradas = new ArrayList<Person>();

    public RegisterResult registroVotantes(Person p) {
        /**
         * Solo se registrarán votantes válidos
         * Solo se permite una inscripción por número de documento
         * DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED;
         */

        if (!p.isAlive()){
            return RegisterResult.DEAD;
        }

        if (p.getAge() >= 0 && p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        }

        if (p.getAge() < 0 || p.getAge() > 122){
            return RegisterResult.INVALID_AGE;
        }

        for (Person personaRegistrada : personasRegistradas){
            if (p.getId() == personaRegistrada.getId()){
                return RegisterResult.DUPLICATED;
            }
        }

        personasRegistradas.add(p);

        return RegisterResult.VALID;
    }
}