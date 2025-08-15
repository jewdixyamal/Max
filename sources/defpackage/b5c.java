package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: b5c  reason: default package */
public final class b5c extends ChipGroup implements kre {
    public final LinkedHashMap A0 = new LinkedHashMap();
    public final je7 B0;
    public a5c z0;

    public b5c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B0 = tu0.r(3, new xda(context, 20));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setChipSpacingVertical(tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(false);
        setPaddingRelative(0, 0, 0, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.B0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        pq9 pq9 = qp4.u0;
        if (isChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9.j(chip).b().a.f));
            chip.setTextColor(pq9.j(chip).getText().a);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(pq9.j(chip).b().m));
        chip.setTextColor(pq9.j(chip).getText().e);
    }

    public final void a(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.A0;
        if (!linkedHashMap.containsKey(valueOf)) {
            Chip chip = new Chip(getMaterialThemeWrapper(), (AttributeSet) null);
            chip.setId(Integer.hashCode(i));
            chip.setText(str);
            chip.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            chip.setTextAlignment(4);
            i4f.l.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), du4.b);
            chip.setClickable(true);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setCheckedIcon((Drawable) null);
            chip.setEnsureMinTouchTargetSize(false);
            b(chip, chip.isChecked(), i);
            chip.setOnCheckedChangeListener(new z4c(this, chip, i));
            for (Map.Entry value : linkedHashMap.entrySet()) {
                ((Chip) value.getValue()).setChecked(false);
            }
            linkedHashMap.put(Integer.valueOf(i), chip);
            addView(chip);
        }
    }

    public final void b(Chip chip, boolean z, int i) {
        if (z) {
            a5c a5c = this.z0;
            if (a5c != null) {
                lh1 B02 = ((CallRateBottomSheet) a5c).B0();
                q0e q0e = B02.Z;
                bi9 bi9 = ((jh1) q0e.getValue()).b;
                bi9 bi92 = new bi9();
                bi92.b(bi9);
                bi92.a(i);
                q0e.m((Object) null, jh1.a((jh1) q0e.getValue(), (Integer) null, bi92, (CharSequence) null, 5));
                y4c.b.getClass();
                if (qq9.l(i) == y4c.OTHER) {
                    pnf.o(B02.z0, gh1.a);
                    B02.s0.m((Object) null, new eqe(b8a.m0));
                }
            }
        } else {
            a5c a5c2 = this.z0;
            if (a5c2 != null) {
                q0e q0e2 = ((CallRateBottomSheet) a5c2).B0().Z;
                bi9 bi93 = ((jh1) q0e2.getValue()).b;
                bi9 bi94 = new bi9();
                bi94.b(bi93);
                bi94.h(i);
                q0e2.m((Object) null, jh1.a((jh1) q0e2.getValue(), (Integer) null, bi94, (CharSequence) null, 5));
            }
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    public final void onDetachedFromWindow() {
        this.A0.clear();
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(fka fka) {
        for (Map.Entry value : this.A0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
    }

    public final void setListener(a5c a5c) {
        this.z0 = a5c;
    }
}
