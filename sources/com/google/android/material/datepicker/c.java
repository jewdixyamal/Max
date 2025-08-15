package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;

public final class c extends hdc {
    public final wmc X;
    public final int Y;
    public final tx0 o;

    public c(ContextThemeWrapper contextThemeWrapper, tx0 tx0, wmc wmc) {
        kc9 kc9 = tx0.a;
        kc9 kc92 = tx0.o;
        if (kc9.a.compareTo(kc92.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (kc92.a.compareTo(tx0.b.a) <= 0) {
            this.Y = (contextThemeWrapper.getResources().getDimensionPixelSize(stb.mtrl_calendar_day_height) * lc9.o) + (MaterialDatePicker.n1(contextThemeWrapper, 16843277) ? contextThemeWrapper.getResources().getDimensionPixelSize(stb.mtrl_calendar_day_height) : 0);
            this.o = tx0;
            this.X = wmc;
            A(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int j() {
        return this.o.Z;
    }

    public final long k(int i) {
        Calendar b = jaf.b(this.o.a.a);
        b.add(2, i);
        return new kc9(b).a.getTimeInMillis();
    }

    public final void r(dec dec, int i) {
        b bVar = (b) dec;
        tx0 tx0 = this.o;
        Calendar b = jaf.b(tx0.a.a);
        b.add(2, i);
        kc9 kc9 = new kc9(b);
        bVar.F0.setText(kc9.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.G0.findViewById(ivb.month_grid);
        if (materialCalendarGridView.a() == null || !kc9.equals(materialCalendarGridView.a().a)) {
            new lc9(kc9, tx0);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(vyb.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.n1(viewGroup.getContext(), 16843277)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new pdc(-1, this.Y));
        return new b(linearLayout, true);
    }
}
