package planner.jenn.jennpmod;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


/**  Para mejorar la experiencia del usuario, se integrará una API de clima que mostrará en tiempo real el estado del
clima y la temperatura actual de la ciudad donde se encuentra el usuario.
La aplicación utilizará los servicios de geolocalización del dispositivo para obtener la ubicación
del usuario y, con esta información, consultará una API gratuita de datos meteorológicos. La API seleccionada
deberá proporcionar datos como la temperatura actual y el estado del clima (soleado, lluvioso,
 nublado, etc.), los cuales serán procesados y mostrados en la interfaz en la seccion de revisar el clima de la aplicación.

Esta funcionalidad permitirá a los estudiantes conocer el clima de su ubicación directamente desde JennPMod,
facilitando la planificación de su día estudiantil y preparandolos para la cituacion climatica
ejemplo, salir con una sombrilla de sus casas!!! */

public class ClimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima);
    }
    //nota
}