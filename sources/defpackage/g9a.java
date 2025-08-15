package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: g9a  reason: default package */
public final class g9a extends ChipGroup implements kre {
    public final Rect A0 = new Rect();
    public final Rect B0 = new Rect();
    public final EditText C0;
    public final LinkedHashMap D0;
    public final fi9 E0;
    public final je7 F0;
    public final je7 G0;
    public e9a z0;

    public g9a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EditText editText = new EditText(context);
        editText.setMinHeight(tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density));
        i4f.n.a(editText.getPaint(), editText.getResources().getDisplayMetrics(), du4.b);
        pq9 pq9 = qp4.u0;
        editText.setTextColor(pq9.j(editText).getText().e);
        editText.setHintTextColor(pq9.j(editText).getText().i);
        editText.setBackgroundColor(0);
        editText.setFallbackLineSpacing(false);
        editText.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        editText.setGravity(16);
        float f = (float) 4;
        editText.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        editText.setLayoutParams(marginLayoutParams);
        editText.setMaxLines(1);
        this.C0 = editText;
        this.D0 = new LinkedHashMap();
        this.E0 = new fi9();
        this.F0 = tu0.r(3, new hy4(context, 29));
        this.G0 = tu0.r(3, new yf3(context, 25, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(tu0.G(f * fk4.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(editText);
        float f2 = (float) 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
        editText.setKeyListener(new f9a(this));
        d();
    }

    private final EnhancedVectorDrawable getCancelChipDrawable() {
        return (EnhancedVectorDrawable) this.G0.getValue();
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.F0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        pq9 pq9 = qp4.u0;
        if (isChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(pq9.j(chip).b().a.m));
            pq9.j(chip).getText();
            chip.setTextColor(-1);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(pq9.j(chip).b().m));
        chip.setTextColor(pq9.j(chip).getText().e);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r17, long r19, java.lang.CharSequence r21, java.lang.String r22, java.lang.String r23) {
        /*
            r16 = this;
            r9 = r16
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            java.util.LinkedHashMap r10 = r9.D0
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            com.google.android.material.chip.Chip r11 = new com.google.android.material.chip.Chip
            android.view.ContextThemeWrapper r0 = r16.getMaterialThemeWrapper()
            r12 = 0
            r11.<init>(r0, r12)
            int r0 = java.lang.Long.hashCode(r17)
            r11.setId(r0)
            r0 = r22
            r11.setText(r0)
            kqe r0 = defpackage.i4f.n
            android.text.TextPaint r1 = r11.getPaint()
            android.content.res.Resources r2 = r11.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r0.a(r1, r2, defpackage.du4.b)
            r13 = 1
            r11.setClickable(r13)
            r11.setCheckable(r13)
            r14 = 0
            r11.setChecked(r14)
            r11.setCheckedIcon(r12)
            r11.setFallbackLineSpacing(r14)
            r11.setEnsureMinTouchTargetSize(r14)
            boolean r2 = r11.isChecked()
            r0 = r16
            r1 = r11
            r3 = r17
            r5 = r19
            r7 = r21
            r8 = r23
            r0.b(r1, r2, r3, r5, r7, r8)
            c9a r15 = new c9a
            r0 = r15
            r1 = r16
            r2 = r11
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r11.setOnCheckedChangeListener(r15)
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0070:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r1.setChecked(r14)
            goto L_0x0070
        L_0x0086:
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r10.put(r0, r11)
            int r0 = r16.getChildCount()
            int r0 = r0 - r13
            r9.addView(r11, r0)
            r16.d()
            e9a r0 = r9.z0
            if (r0 == 0) goto L_0x00b8
            ph4 r0 = (defpackage.ph4) r0
            java.lang.Object r0 = r0.b
            g9a r0 = (defpackage.g9a) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.widget.ScrollView
            if (r1 == 0) goto L_0x00ad
            r12 = r0
            android.widget.ScrollView r12 = (android.widget.ScrollView) r12
        L_0x00ad:
            if (r12 == 0) goto L_0x00b8
            b r0 = new b
            r1 = 1
            r0.<init>((int) r1, (java.lang.Object) r12)
            r12.post(r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9a.a(long, long, java.lang.CharSequence, java.lang.String, java.lang.String):void");
    }

    public final void b(Chip chip, boolean z, long j, long j2, CharSequence charSequence, String str) {
        if (z) {
            chip.setChipIcon(getCancelChipDrawable());
            chip.setOnTouchListener(new rf1(chip, 3, new d9a(this, j, chip)));
        } else {
            fi9 fi9 = this.E0;
            Object d = fi9.d(j2);
            if (d == null) {
                d = new g5a(getContext());
                fi9.g(j2, d);
            }
            g5a g5a = (g5a) d;
            g5a.b(oag.a(charSequence, Long.valueOf(j2)), str);
            chip.setChipIcon(g5a);
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    public final void c(long j) {
        LinkedHashMap linkedHashMap = this.D0;
        Chip chip = (Chip) linkedHashMap.get(Long.valueOf(j));
        if (chip != null) {
            linkedHashMap.remove(Long.valueOf(j));
            removeView(chip);
            d();
        }
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(7, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.A0;
        editText.getHitRect(rect);
        Rect rect2 = this.B0;
        rect2.set(rect);
        rect2.left = rect2.right;
        rect2.right = getRight();
    }

    public final e9a getCallback() {
        return this.z0;
    }

    public final EditText getEditText() {
        return this.C0;
    }

    public final void onDetachedFromWindow() {
        this.E0.a();
        this.D0.clear();
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(fka fka) {
        EnhancedVectorDrawable enhancedVectorDrawable;
        EditText editText = this.C0;
        editText.setTextColor(fka.getText().e);
        editText.setHintTextColor(fka.getText().i);
        for (Map.Entry value : this.D0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
        je7 je7 = this.G0;
        if (!je7.a()) {
            je7 = null;
        }
        if (je7 != null && (enhancedVectorDrawable = (EnhancedVectorDrawable) je7.getValue()) != null) {
            c54.Z(enhancedVectorDrawable, "circle_background", -1);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = this.A0;
        motionEvent.setLocation((float) rect.right, ((float) rect.bottom) / 2.0f);
        return this.C0.dispatchTouchEvent(motionEvent);
    }

    public final void setCallback(e9a e9a) {
        this.z0 = e9a;
    }
}
