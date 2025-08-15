package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int m1;
    public tx0 n1;

    public final void L0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m1);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.m1 = bundle.getInt("THEME_RES_ID_KEY");
        zr6.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.n1 = (tx0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(d0(), this.m1));
        throw null;
    }
}
