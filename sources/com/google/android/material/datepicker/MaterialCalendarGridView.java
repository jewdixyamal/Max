package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        jaf.d((Calendar) null);
        if (MaterialDatePicker.n1(getContext(), 16843277)) {
            setNextFocusLeftId(ivb.cancel_button);
            setNextFocusRightId(ivb.confirm_button);
        }
        this.a = MaterialDatePicker.n1(getContext(), tsb.nestedScrollable);
        zmf.j(this, new h18(2));
    }

    public final lc9 a() {
        return (lc9) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (lc9) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((lc9) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lc9 lc9 = (lc9) super.getAdapter();
        lc9.getClass();
        int max = Math.max(lc9.a(), getFirstVisiblePosition());
        int min = Math.min(lc9.c(), getLastVisiblePosition());
        lc9.getItem(max);
        lc9.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((lc9) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((lc9) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((lc9) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((lc9) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.a) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < ((lc9) super.getAdapter()).a()) {
            super.setSelection(((lc9) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m1getAdapter() {
        return (lc9) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof lc9) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), lc9.class.getCanonicalName()}));
    }
}
