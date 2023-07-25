package unal.todosalau.tablayoutexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declaración de las vistas utilizadas en el layout
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de las vistas desde el layout
        viewPager = findViewById(R.id.viewPager);
        setupViewPager();

        tabLayout = findViewById(R.id.tabLayout);

        // Configuración del TabLayoutMediator para conectar el TabLayout con el
        // ViewPager
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    // Asignar el texto a cada pestaña del TabLayout según la posición
                    switch (position) {
                        case 0:
                            tab.setText("Fragmento A");
                            break;
                        case 1:
                            tab.setText("Fragmento B");
                            break;
                        case 2:
                            tab.setText("Fragmento C");
                            break;
                    }
                }).attach();
    }

    // Método para configurar el ViewPager y su adaptador
    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
