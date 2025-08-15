package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Locale;

/* renamed from: t9g  reason: default package */
public final class t9g extends hdc {
    public final MaterialCalendar o;

    public t9g(MaterialCalendar materialCalendar) {
        this.o = materialCalendar;
    }

    public final int j() {
        return this.o.n1.Y;
    }

    public final void r(dec dec, int i) {
        MaterialCalendar materialCalendar = this.o;
        int i2 = materialCalendar.n1.a.c + i;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)});
        TextView textView = ((s9g) dec).F0;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(jaf.c().get(1) == i2 ? String.format(context.getString(wzb.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i2)}) : String.format(context.getString(wzb.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i2)}));
        ph4 ph4 = materialCalendar.q1;
        if (jaf.c().get(1) == i2) {
            Object obj = ph4.b;
        } else {
            Object obj2 = ph4.a;
        }
        throw null;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new s9g((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(vyb.mtrl_calendar_year, viewGroup, false));
    }
}
