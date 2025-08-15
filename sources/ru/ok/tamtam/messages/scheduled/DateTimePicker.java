package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/messages/scheduled/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lwme;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lu34;", "listener", "Le5f;", "setListener$scheduled_send_picker_dialog_release", "(Lu34;)V", "setListener", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class DateTimePicker extends ConstraintLayout implements wme {
    public final RecyclerView G0;
    public final RecyclerView H0;
    public final RecyclerView I0;
    public final View J0 = findViewById(byb.top_line);
    public final View K0 = findViewById(byb.bottom_line);
    public final TextView L0 = ((TextView) findViewById(byb.time_divider));
    public u34 M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final int Q0;

    public DateTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sme sme;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ltb.date_picker_today_margin_top);
        this.Q0 = dimensionPixelSize;
        View.inflate(context, pyb.date_time_picker, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(byb.days_recycler_view);
        this.G0 = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(byb.hours_recycler_view);
        this.H0 = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(byb.minutes_recycler_view);
        this.I0 = recyclerView3;
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(ltb.date_picker_item_height);
        hl7 hl7 = new hl7((ema) y34.e);
        hl7.A(true);
        recyclerView.setAdapter(hl7);
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new d71(dimensionPixelSize, 2));
        recyclerView.setLayoutManager(new SliderLayoutManager(context, new f9(this, 23, hl7)));
        recyclerView.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        ste ste = new ste();
        recyclerView2.setAdapter(ste);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemAnimator((mdc) null);
        recyclerView2.j(new d71(dimensionPixelSize, 2));
        recyclerView2.setLayoutManager(new SliderLayoutManager(context, new r34(this, ste, 0)));
        recyclerView2.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        ste ste2 = new ste();
        recyclerView3.setAdapter(ste2);
        recyclerView3.setItemAnimator((mdc) null);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.j(new d71(dimensionPixelSize, 2));
        recyclerView3.setLayoutManager(new SliderLayoutManager(context, new r34(this, ste2, 1)));
        recyclerView3.setEdgeEffectFactory(new ioa(dimensionPixelSize2));
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context2 = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context2);
        }
        z(sme);
    }

    /* access modifiers changed from: private */
    public static final void setDays$lambda$7$lambda$6(DateTimePicker dateTimePicker) {
        dateTimePicker.N0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setHours$lambda$9$lambda$8(DateTimePicker dateTimePicker) {
        dateTimePicker.O0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setMinutes$lambda$11$lambda$10(DateTimePicker dateTimePicker) {
        dateTimePicker.P0 = false;
    }

    public final void setListener$scheduled_send_picker_dialog_release(u34 u34) {
        this.M0 = u34;
    }

    public final void z(sme sme) {
        setBackgroundColor(sme.m);
        View view = this.J0;
        int i = sme.k;
        view.setBackgroundColor(i);
        this.K0.setBackgroundColor(i);
        this.L0.setTextColor(sme.F);
    }
}
