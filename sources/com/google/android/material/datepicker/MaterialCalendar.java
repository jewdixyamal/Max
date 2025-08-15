package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int m1;
    public tx0 n1;
    public kc9 o1;
    public int p1;
    public ph4 q1;
    public RecyclerView r1;
    public RecyclerView s1;
    public View t1;
    public View u1;
    public View v1;
    public View w1;

    public final void L0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m1);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.o1);
    }

    public final void e1(kc9 kc9) {
        c cVar = (c) this.s1.getAdapter();
        int d = cVar.o.a.d(kc9);
        int d2 = d - cVar.o.a.d(this.o1);
        boolean z = false;
        boolean z2 = Math.abs(d2) > 3;
        if (d2 > 0) {
            z = true;
        }
        this.o1 = kc9;
        if (z2 && z) {
            this.s1.x0(d - 3);
            this.s1.post(new zj0(d, 2, this));
        } else if (z2) {
            this.s1.x0(d + 3);
            this.s1.post(new zj0(d, 2, this));
        } else {
            this.s1.post(new zj0(d, 2, this));
        }
    }

    public final void f1(int i) {
        this.p1 = i;
        if (i == 2) {
            this.r1.getLayoutManager().y0(this.o1.c - ((t9g) this.r1.getAdapter()).o.n1.a.c);
            this.v1.setVisibility(0);
            this.w1.setVisibility(8);
            this.t1.setVisibility(8);
            this.u1.setVisibility(8);
        } else if (i == 1) {
            this.v1.setVisibility(8);
            this.w1.setVisibility(0);
            this.t1.setVisibility(0);
            this.u1.setVisibility(0);
            e1(this.o1);
        }
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.m1 = bundle.getInt("THEME_RES_ID_KEY");
        zr6.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.n1 = (tx0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        zr6.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o1 = (kc9) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        c44 c44;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d0(), this.m1);
        this.q1 = new ph4((Context) contextThemeWrapper, 7);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        kc9 kc9 = this.n1.a;
        if (MaterialDatePicker.n1(contextThemeWrapper, 16843277)) {
            i2 = vyb.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = vyb.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = U0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(stb.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(stb.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(stb.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(stb.mtrl_calendar_days_of_week_height);
        int i3 = lc9.o;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(stb.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(stb.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(stb.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(ivb.mtrl_calendar_days_of_week);
        zmf.j(gridView, new h18(0));
        int i4 = this.n1.X;
        if (i4 <= 0) {
            c44 = new c44();
        }
        gridView.setAdapter(c44);
        gridView.setNumColumns(kc9.o);
        gridView.setEnabled(false);
        this.s1 = (RecyclerView) inflate.findViewById(ivb.mtrl_calendar_months);
        d0();
        this.s1.setLayoutManager(new i18(this, i, i));
        this.s1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.n1, new wmc(this, false));
        this.s1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(jyb.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ivb.mtrl_calendar_year_selector_frame);
        this.r1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.r1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.r1.setAdapter(new t9g(this));
            this.r1.j(new bo6(this));
        }
        if (inflate.findViewById(ivb.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(ivb.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            zmf.j(materialButton, new fr0(3, this));
            View findViewById = inflate.findViewById(ivb.month_navigation_previous);
            this.t1 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(ivb.month_navigation_next);
            this.u1 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.v1 = inflate.findViewById(ivb.mtrl_calendar_year_selector_frame);
            this.w1 = inflate.findViewById(ivb.mtrl_calendar_day_selector_frame);
            f1(1);
            materialButton.setText(this.o1.c());
            this.s1.m(new j18(this, cVar, materialButton));
            materialButton.setOnClickListener(new e0d(5, this));
            this.u1.setOnClickListener(new g18(this, cVar, 1));
            this.t1.setOnClickListener(new g18(this, cVar, 0));
        }
        if (!MaterialDatePicker.n1(contextThemeWrapper, 16843277)) {
            new g34(1).a(this.s1);
        }
        this.s1.x0(cVar.o.a.d(this.o1));
        zmf.j(this.s1, new h18(1));
        return inflate;
    }
}
