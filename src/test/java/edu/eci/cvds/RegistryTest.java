package edu.eci.cvds;


import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registro = new Registry();

    @Test
    public void dadoUnaPersona_cuandoSeRegistraParaVotar_EntoncesSeAnadeALaLista() {
        int primeraLongitud = registro.personasRegistradas.size();
        Person persona = new Person("Sebastian Arias", 52665481, 35, Gender.MALE, true);
        RegisterResult resultado = registro.registroVotantes(persona);
        Assert.assertEquals(++primeraLongitud, registro.personasRegistradas.size());
    }

    @Test
    public void dadoUnaPersona_cuandoPuedeVotar_entoncesRetornaVALID() {
        Person persona = new Person("Julia Mejia", 2160640, 21, Gender.FEMALE, true);
        RegisterResult resultado = registro.registroVotantes(persona);
        Assert.assertEquals(RegisterResult.VALID, resultado);
    }

    @Test
    public void dadoUnaPersona_cuandoFallecio_entoncesRetorneDEAD() {
        Person persona = new Person("Juan Lopez", 9167644, 65, Gender.MALE, false);
        RegisterResult resultado = registro.registroVotantes(persona);
        Assert.assertEquals(RegisterResult.DEAD, resultado);
    }

    @Test
    public void dadoUnaPersona_cuandoEsMenorDeEdad_entoncesRetorneUNDERAGE() {
        Person persona = new Person("Jose Mejia", 10452012, 8, Gender.MALE, true);
        RegisterResult resultado = registro.registroVotantes(persona);
        Assert.assertEquals(RegisterResult.UNDERAGE, resultado);
    }

    @Test
    public void dadoUnaPersona_cuandoIngresaEdadNegativa_entoncesRetorneINVALIDAGE() {
        Person persona = new Person("Lupita Flores", 3657840, -34, Gender.UNIDENTIFIED, true);
        RegisterResult resultado = registro.registroVotantes(persona);
        Assert.assertEquals(RegisterResult.INVALID_AGE, resultado);
    }

    @Test
    public void dadoUnaPersona_cuandoSuEdadEstaFueraDeRango_entoncesRetorneINVALIDAGE() {
        Person persona = new Person("Patricio Perez", 8796584, 123, Gender.UNIDENTIFIED, true);
        RegisterResult resultado= registro.registroVotantes(persona);
        Assert.assertEquals(RegisterResult.INVALID_AGE, resultado);
    }

    @Test
    public void dadoUnaPersona_cuandoElIdYaExiste_entoncesRetorneDUPLICATED() {
        Person persona = new Person("Juan Gonzalez", 2172577, 22, Gender.MALE, true);
        Person persona2 = new Person("Juan Gonzalez", 2172577, 22, Gender.MALE, true);
        RegisterResult resultado = registro.registroVotantes(persona);
        RegisterResult resultado2 = registro.registroVotantes(persona2);
        Assert.assertEquals(RegisterResult.DUPLICATED, resultado2);
    }
}