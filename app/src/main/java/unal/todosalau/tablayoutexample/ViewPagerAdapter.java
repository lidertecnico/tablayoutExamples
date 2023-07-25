package unal.todosalau.tablayoutexample;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// Adaptador para el ViewPager que muestra los fragmentos
class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        // Crear un fragmento diferente según la posición en el ViewPager
        switch (position) {
            case 0:
                return new FragmentA(); // Devuelve el Fragmento A en la posición 0
            case 1:
                return new FragmentB(); // Devuelve el Fragmento B en la posición 1
            case 2:
                return new FragmentC(); // Devuelve el Fragmento C en la posición 2
            default:
                return null; // Devuelve null si la posición no está definida (no debería ocurrir)
        }
    }

    @Override
    public int getItemCount() {
        return 3; // número de fragmentos en el ViewPager (FragmentA, FragmentB y FragmentC)
    }
}
