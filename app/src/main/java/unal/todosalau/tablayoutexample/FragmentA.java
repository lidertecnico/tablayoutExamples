// Importar las clases necesarias
package unal.todosalau.tablayoutexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.google.android.material.button.MaterialButton;

// Definición de la clase FragmentA que extiende de Fragmento
public class FragmentA extends Fragment {

    // Declarar una referencia al botón de Material
    private MaterialButton materialButton;

    // Método que se llama cuando el Fragmento debe crear su vista
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        // Inflar el diseño del Fragmento desde el archivo XML fragment_a.xml
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        // Obtener una referencia al botón de Material desde la vista inflada
        materialButton = view.findViewById(R.id.button_animar_frag_a);

        // Configurar un Listener para el clic del botón
        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aplicar una animación de desvanecimiento (fade-in) a la vista del Fragmento
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            }
        });

        // Devolver la vista creada para que se muestre en la interfaz de usuario
        return view;
    }
}
