package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sv8  reason: default package */
public final class sv8 extends LinearLayout implements kre, kx5 {
    public static final /* synthetic */ bc7[] Q0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public iv8 E0;
    public boolean F0;
    public final yj G0;
    public boolean H0;
    public ov8 I0;
    public final q0e J0;
    public final w7c K0;
    public final q0e L0;
    public final w7c M0;
    public final je7 N0;
    public final Rect O0;
    public final ArrayList P0;
    public int a;
    public final ImageView b;
    public final qv8 c;
    public final int o = woc.W0;
    public final je7 s0;
    public final je7 t0;
    public final StateListDrawable u0;
    public final ImageView v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9 = new oi9(sv8.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z");
        nec.a.getClass();
        Q0 = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [qv8, android.widget.TextView, android.view.View, android.widget.EditText] */
    /* JADX WARNING: type inference failed for: r15v18, types: [ov8, java.lang.Object] */
    public sv8(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        float f = (float) 4;
        this.a = tu0.G(fk4.d().getDisplayMetrics().density * f);
        ImageView imageView = new ImageView(context);
        imageView.setId(xoc.S);
        pq9 pq9 = qp4.u0;
        imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).a().h().b.b));
        float f2 = (float) 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(tu0.G(f * fk4.d().getDisplayMetrics().density), layoutParams.topMargin, layoutParams.rightMargin, this.a);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        ? editText = new EditText(context);
        editText.setId(xoc.R);
        editText.setBackground((Drawable) null);
        editText.setPadding(0, 0, 0, 0);
        editText.setMaxLines(8);
        os2.l.b(editText, du4.b);
        editText.setInputType(editText.getInputType() | 16384);
        editText.setImeOptions(268435456);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        float f3 = (float) 6;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        layoutParams2.setMargins(G, G, G, G);
        editText.setLayoutParams(layoutParams2);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(13, this));
        gestureDetector.setIsLongpressEnabled(true);
        editText.setOnTouchListener(new q46(gestureDetector, 4));
        np8.n(editText);
        this.c = editText;
        this.s0 = tu0.r(3, new yf3(context, 17, this));
        this.t0 = tu0.r(3, new hy4(context, 13));
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(100.0f);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(100.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        this.u0 = stateListDrawable;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(xoc.V);
        float f4 = (float) 36;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 80;
        layoutParams3.setMarginStart(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        imageView2.setLayoutParams(layoutParams3);
        this.v0 = imageView2;
        this.w0 = tu0.r(3, new hy4(context, 14));
        this.x0 = tu0.r(3, new fv8(this, 2));
        this.y0 = tu0.r(3, new fv8(this, 3));
        this.z0 = tu0.r(3, new fv8(this, 4));
        this.A0 = tu0.r(3, new fv8(this, 5));
        this.B0 = tu0.r(3, new fv8(this, 6));
        this.C0 = tu0.r(3, new fv8(this, 0));
        this.D0 = tu0.r(3, new fv8(this, 1));
        this.E0 = iv8.a;
        this.G0 = new yj(this);
        this.I0 = new Object();
        q0e a2 = r0e.a((Object) null);
        this.J0 = a2;
        this.K0 = new w7c(a2);
        q0e a3 = r0e.a(0);
        this.L0 = a3;
        this.M0 = new w7c(a3);
        this.N0 = tu0.r(3, new j78(8));
        this.O0 = new Rect();
        this.P0 = new ArrayList();
        setId(xoc.X);
        setClipChildren(false);
        setClipToPadding(false);
        int G2 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        setPadding(G2, G2, G2, G2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        setLayoutParams(layoutParams4);
        addView(imageView);
        addView(editText);
        addView(imageView2);
        imageView.setImageResource(woc.a1);
        editText.setAccessibilityDelegate(new a07(1, this));
        editText.addTextChangedListener(new py4(1, this));
        onThemeChanged(pq9.j(this));
    }

    public static LayerDrawable b(sv8 sv8) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{sv8.u0, sv8.getCheckDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(sv8 sv8) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{sv8.u0, sv8.getArrowDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.x0.getValue();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.z0.getValue();
    }

    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.A0.getValue();
    }

    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.D0.getValue();
    }

    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.C0.getValue();
    }

    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.N0.getValue();
    }

    private final Drawable getMicIcon() {
        return (Drawable) this.B0.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    private final void setSendActionState(ov8 ov8) {
        this.I0 = ov8;
        k(qp4.u0.j(this));
    }

    /* access modifiers changed from: private */
    public final void setVideoMsgButtonVisible(boolean z) {
        ImageView imageView = this.v0;
        je7 je7 = this.w0;
        if (z) {
            ay7.b(this, (View) je7.getValue(), Integer.valueOf(indexOfChild(imageView)));
            ((View) je7.getValue()).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else if (je7.a()) {
            ((ImageView) je7.getValue()).setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void a(du4 du4) {
        addOnLayoutChangeListener(new hp1(this, 2, du4));
    }

    public final void e(boolean z) {
        this.H0 = z;
        qv8 qv8 = this.c;
        if (z) {
            mr0.V(qv8);
        } else {
            mr0.I(qv8);
        }
    }

    public final void f(CharSequence charSequence) {
        qv8 qv8 = this.c;
        Editable text = qv8.getText();
        if (text == null || charSequence == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = qv8.getSelectionStart();
        int selectionEnd = qv8.getSelectionEnd();
        int max = Math.max(selectionStart, 0);
        int max2 = Math.max(selectionEnd, 0);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
            return;
        }
        text.replace(min, max3, charSequence, 0, charSequence.length());
    }

    public final boolean g() {
        Editable text = this.c.getText();
        return text == null || w9e.C0(text);
    }

    public final View getAudioRecordAnchor() {
        return this.v0;
    }

    public final int getCursorPosition() {
        return this.c.getSelectionEnd();
    }

    public final iv8 getEmojiExpandableState() {
        return this.E0;
    }

    public final j0e getMessagePosition() {
        return this.M0;
    }

    public final j0e getMessageState() {
        return this.K0;
    }

    public final ov8 getSendActionState() {
        return this.I0;
    }

    public final CharSequence getText() {
        Editable text = this.c.getText();
        if (text != null) {
            return text.subSequence(0, text.length());
        }
        return null;
    }

    public final View getVideoMessageRecordAnchor() {
        je7 je7 = this.w0;
        if (br7.H(je7)) {
            return (View) je7.getValue();
        }
        return null;
    }

    public final void h(int i) {
        if (i != -1) {
            qv8 qv8 = this.c;
            qv8.setSelection(Math.min(i, qv8.length()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (defpackage.w9e.p0(r1, "\n", false) == true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r5 = this;
            je7 r0 = r5.t0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            qv8 r1 = r5.c
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = "\n"
            boolean r1 = defpackage.w9e.p0(r1, r3, r2)
            r3 = 1
            if (r1 != r3) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            boolean r1 = r5.g()
            szd r4 = defpackage.szd.b
            if (r1 == 0) goto L_0x0048
            boolean r1 = r5.F0
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            boolean r1 = r5.H0
            if (r1 == 0) goto L_0x003c
            r5.H0 = r2
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            r5.setExpandableState(r4)
            goto L_0x0051
        L_0x003c:
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            szd r0 = defpackage.szd.a
            r5.setExpandableState(r0)
            goto L_0x0051
        L_0x0048:
            java.lang.Object r5 = r0.getValue()
            uzd r5 = (defpackage.uzd) r5
            r5.setExpandableState(r4)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv8.i():void");
    }

    public final void j() {
        je7 je7 = this.s0;
        if (je7.a()) {
            ImageView imageView = (ImageView) je7.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).a().h().b.b));
        }
    }

    public final void k(fka fka) {
        iv8 iv8;
        ov8 ov8 = this.I0;
        boolean g = g();
        nv8 nv8 = nv8.a;
        ImageView imageView = this.v0;
        if (!g || !tpa.f(ov8, nv8)) {
            boolean f = tpa.f(ov8, mv8.a);
            StateListDrawable stateListDrawable = this.u0;
            if (f || tpa.f(ov8, nv8)) {
                stateListDrawable.setState(new int[]{16842910});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                fka.getIcon();
                ngg.G(checkDrawable, -1);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                setVideoMsgButtonVisible(false);
            } else {
                boolean g2 = g();
                pq9 pq9 = qp4.u0;
                if (g2 && (iv8 = this.E0) != iv8.a) {
                    Drawable emojiArrowDownDrawable = iv8 == iv8.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                    imageView.setImageDrawable(emojiArrowDownDrawable);
                    ngg.G(emojiArrowDownDrawable, pq9.j(this).a().h().b.b);
                    setVideoMsgButtonVisible(false);
                } else if (!g() || !(ov8 instanceof kv8)) {
                    if (imageView.getDrawable() != getSendIcon()) {
                        stateListDrawable.setState(new int[]{16842910});
                        imageView.setImageDrawable(getSendIcon());
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setEnabled(true);
                    }
                    Drawable arrowDrawable = getArrowDrawable();
                    fka.getIcon();
                    ngg.G(arrowDrawable, -1);
                    setVideoMsgButtonVisible(false);
                } else {
                    ((kv8) ov8).getClass();
                    if (pv8.$EnumSwitchMapping$0[au1.s(1)] == 1) {
                        ngg.G(getMicIcon(), pq9.j(this).a().h().b.b);
                        if (imageView.getDrawable() != getMicIcon()) {
                            imageView.setImageDrawable(getMicIcon());
                            imageView.setEnabled(true);
                            rh4.p((float) 4, fk4.d().getDisplayMetrics().density, imageView);
                            je7 je7 = this.w0;
                            if (je7.a()) {
                                ImageView imageView2 = (ImageView) je7.getValue();
                                bc7 bc7 = Q0[0];
                                setVideoMsgButtonVisible(((Boolean) this.G0.b).booleanValue());
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        } else {
            ngg.G(getCheckDrawable(), fka.d().b.a.b);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
        }
        i();
        imageView.invalidate();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        String[] d = zmf.d(this);
        if (d == null || editorInfo == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = d;
        return new k17(onCreateInputConnection, new z16(8, this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ArrayList arrayList = this.P0;
            arrayList.clear();
            ImageView imageView = this.v0;
            float f = (float) 12;
            int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getLeft());
            int c3 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getTop());
            int c4 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getRight());
            int c5 = rh4.c(f, fk4.d().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.O0;
            rect.set(c2, c3, c4, c5);
            arrayList.add(rect);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        tc3 tc3 = touchDelegate instanceof tc3 ? (tc3) touchDelegate : null;
        if (tc3 != null) {
            tc3.a.clear();
        }
        float f = (float) 10;
        ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), this, this.b);
        float f2 = (float) 12;
        ft.b(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), this, this.c);
        float f3 = (float) 6;
        ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), this, this.v0);
        je7 je7 = this.s0;
        if (je7.a()) {
            ft.b(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), this, (ImageView) je7.getValue());
        }
        je7 je72 = this.w0;
        if (je72.a()) {
            ft.b(tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), this, (ImageView) je72.getValue());
        }
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        setBackgroundColor(pq9.j(this).a().h().a.d);
        this.b.setImageTintList(ColorStateList.valueOf(pq9.j(this).a().h().b.b));
        xoe text = fka.getText();
        qv8 qv8 = this.c;
        qv8.setTextColor(text.e);
        qv8.setHintTextColor(ote.b0(fka.getText().i, 0.4f));
        qv8.setHighlightColor(fka.getText().j);
        Drawable textCursorDrawable = qv8.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fka.getText().j));
        }
        Editable text2 = qv8.getText();
        if (text2 != null) {
            for (Object obj : text2.getSpans(0, text2.length(), Object.class)) {
                if (obj instanceof qu8) {
                    ((qu8) obj).b = pq9.j(qv8).a().d(true).d.b;
                } else if (obj instanceof kre) {
                    ((kre) obj).onThemeChanged(fka);
                }
            }
        }
        StateListDrawable stateListDrawable = this.u0;
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(fka.b().a.m);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(fka.d().a.b.l);
        k(fka);
        j();
        invalidate();
    }

    public final void setCustomSelectionActionModeCallback(m56 m56) {
        qv8 qv8 = this.c;
        qv8.setCustomSelectionActionModeCallback((ActionMode.Callback) m56.invoke(qv8));
    }

    public final void setEmojiExpandableState(iv8 iv8) {
        this.E0 = iv8;
        k(qp4.u0.j(this));
    }

    public final void setInputEnabled(boolean z) {
        qv8 qv8 = this.c;
        if (z) {
            qv8.setFilters(new InputFilter[0]);
            return;
        }
        qv8.setFilters(new InputFilter[]{getEmptyFilter()});
    }

    public final void setInputHint(CharSequence charSequence) {
        this.c.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.c.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z) {
        this.F0 = z;
        i();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setLeftOuterIconOnClickListener(k56 k56) {
        tu0.K((View) this.t0.getValue(), 300, new m6(15, k56));
    }

    public final void setLeftOuterIconText(CharSequence charSequence) {
        je7 je7 = this.t0;
        ay7.b(this, (View) je7.getValue(), 0);
        ((uzd) je7.getValue()).setText(charSequence);
    }

    public final void setLeftOuterIconVisible(boolean z) {
        je7 je7 = this.t0;
        if (z) {
            ay7.b(this, (View) je7.getValue(), 0);
        } else if (je7.a()) {
            removeView((View) je7.getValue());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        je7 je7 = this.s0;
        if (onTouchListener != null) {
            ((ImageView) je7.getValue()).setOnTouchListener(onTouchListener);
        } else if (je7.a()) {
            ((ImageView) je7.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setRightInnerIconVisible(boolean z) {
        je7 je7 = this.s0;
        if (z) {
            ay7.b(this, (View) je7.getValue(), Integer.valueOf(indexOfChild(this.c) + 1));
            j();
        } else if (je7.a()) {
            removeView((View) je7.getValue());
        }
    }

    public final void setRightOuterIconActionState(ov8 ov8) {
        setSendActionState(ov8);
    }

    public final void setRightOuterIconEnabled(boolean z) {
        this.v0.setEnabled(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.v0.setOnTouchListener(onTouchListener);
    }

    public final void setText(CharSequence charSequence) {
        qv8 qv8 = this.c;
        if (charSequence == null) {
            Editable text = qv8.getText();
            if (text != null) {
                text.clear();
                return;
            }
            return;
        }
        qv8.setText(charSequence);
    }

    public final void setVideoMessageEnabled(boolean z) {
        this.G0.o1(this, Q0[0], Boolean.valueOf(z));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        je7 je7 = this.w0;
        if (onTouchListener != null) {
            ((ImageView) je7.getValue()).setOnTouchListener(onTouchListener);
        } else if (je7.a()) {
            ((ImageView) je7.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setInputHint(int i) {
        this.c.setHint(i);
    }
}
