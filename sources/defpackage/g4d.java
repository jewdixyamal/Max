package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g4d  reason: default package */
public final class g4d extends RecyclerView {
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(rh4.q((float) 150, fk4.d().getDisplayMetrics().density, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
    }
}
