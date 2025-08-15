package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/messages/scheduled/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "wsd", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class SliderLayoutManager extends LinearLayoutManager {
    public final wsd E;
    public RecyclerView F;
    public final int G;
    public final float H;
    public final float I;
    public final int J;
    public final g34 K = new g34(0);

    public SliderLayoutManager(Context context, wsd wsd) {
        this.E = wsd;
        this.G = context.getResources().getInteger(kyb.picker_min_distance);
        int i = ltb.picker_scale_factor;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.H = typedValue.getFloat();
        int i2 = ltb.picker_min_scale_factor;
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(i2, typedValue2, true);
        this.I = typedValue2.getFloat();
        this.J = context.getResources().getDimensionPixelSize(ltb.date_picker_selection_rect_offset) * 2;
        o1(1);
    }

    public final void W(RecyclerView recyclerView) {
        this.F = recyclerView;
        this.K.a(recyclerView);
    }

    public final void j0(vdc vdc, zdc zdc) {
        super.j0(vdc, zdc);
        t1();
    }

    public final void n0(int i) {
        int S;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && i == 0) {
            int height = recyclerView.getHeight();
            int height2 = recyclerView.getHeight() / 2;
            Iterator it = ote.Y(0, recyclerView.getChildCount()).iterator();
            int i2 = -1;
            while (((i37) it).c) {
                int a = ((i37) it).a();
                View childAt = recyclerView.getChildAt(a);
                int abs = Math.abs((((a.z(childAt) - a.F(childAt)) / 2) + a.F(childAt)) - height2);
                if (a != recyclerView.getChildCount() - 1) {
                    if (abs < height) {
                        S = RecyclerView.S(childAt);
                    }
                } else if (abs <= height) {
                    S = RecyclerView.S(childAt);
                }
                i2 = S;
                height = abs;
            }
            wsd wsd = this.E;
            if (wsd != null) {
                wsd.a(i2);
            }
        }
    }

    public final void t1() {
        sme sme;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            if (recyclerView.isInEditMode()) {
                sme = ee4.e0;
            } else {
                Context context = recyclerView.getContext();
                khe khe = sme.a0;
                sme = fm9.R(context);
            }
            float f = (((float) this.J) * 1.05f) / 2.0f;
            float f2 = (float) (this.o / 2);
            float f3 = f2 - f;
            float f4 = f + f2;
            HashSet hashSet = new HashSet();
            Iterator it = ote.Y(0, w()).iterator();
            while (((i37) it).c) {
                View v = v(((i37) it).a());
                AppCompatTextView appCompatTextView = v instanceof AppCompatTextView ? (AppCompatTextView) v : null;
                if (appCompatTextView != null) {
                    float height = (((float) appCompatTextView.getHeight()) / 2.0f) + appCompatTextView.getY();
                    if (!hashSet.contains(appCompatTextView.getText()) && ((float) appCompatTextView.getTop()) >= f3 && ((float) appCompatTextView.getBottom()) <= f4) {
                        hashSet.add(appCompatTextView.getText());
                        pag.F(appCompatTextView, li6.CLOCK_TICK);
                    }
                    float abs = Math.abs(height - f2);
                    boolean z = abs <= ((float) this.G);
                    float sqrt = z ? 1.0f : ((float) 1) - (((float) Math.sqrt((double) (abs / ((float) this.o)))) * this.H);
                    float f5 = this.I;
                    if (sqrt < f5) {
                        sqrt = f5;
                    }
                    appCompatTextView.setScaleX(sqrt);
                    appCompatTextView.setScaleY(sqrt);
                    appCompatTextView.setTextColor(z ? sme.F : sme.M);
                }
            }
        }
    }

    public final int z0(int i, vdc vdc, zdc zdc) {
        if (this.p != 1) {
            return 0;
        }
        int z0 = super.z0(i, vdc, zdc);
        if (z0 != 0) {
            t1();
        }
        return z0;
    }
}
