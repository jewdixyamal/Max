package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements m3b {
    public List a = Collections.emptyList();
    public gz1 b = gz1.g;
    public int c = 0;
    public float o = 0.0533f;
    public float s0 = 0.08f;
    public boolean t0 = true;
    public boolean u0 = true;
    public int v0;
    public rbe w0;
    public View x0;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dz1 dz1 = new dz1(context);
        this.w0 = dz1;
        this.x0 = dz1;
        addView(dz1);
        this.v0 = 1;
    }

    private List<xz3> getCuesWithStylingPreferencesApplied() {
        if (this.t0 && this.u0) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            vz3 a2 = ((xz3) this.a.get(i)).a();
            if (!this.t0) {
                a2.n = false;
                CharSequence charSequence = a2.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a2.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a2.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ud7)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                s36.A(a2);
            } else if (!this.u0) {
                s36.A(a2);
            }
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (maf.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private gz1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        gz1 gz1;
        int i = maf.a;
        gz1 gz12 = gz1.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return gz12;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            int i2 = -1;
            int i3 = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
            int i4 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
            int i5 = 0;
            int i6 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
            if (userStyle.hasEdgeType()) {
                i5 = userStyle.edgeType;
            }
            int i7 = i5;
            if (userStyle.hasEdgeColor()) {
                i2 = userStyle.edgeColor;
            }
            gz1 = new gz1(i3, i4, i6, i7, i2, userStyle.getTypeface());
        } else {
            gz1 = new gz1(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return gz1;
    }

    private <T extends View & rbe> void setView(T t) {
        removeView(this.x0);
        View view = this.x0;
        if (view instanceof x3g) {
            ((x3g) view).b.destroy();
        }
        this.x0 = t;
        this.w0 = (rbe) t;
        addView(t);
    }

    public final void b() {
        this.w0.a(getCuesWithStylingPreferencesApplied(), this.b, this.o, this.c, this.s0);
    }

    public final void k(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.u0 = z;
        b();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.t0 = z;
        b();
    }

    public void setBottomPaddingFraction(float f) {
        this.s0 = f;
        b();
    }

    public void setCues(List<xz3> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        b();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.o = f;
        b();
    }

    public void setStyle(gz1 gz1) {
        this.b = gz1;
        b();
    }

    public void setViewType(int i) {
        if (this.v0 != i) {
            if (i == 1) {
                setView(new dz1(getContext()));
            } else if (i == 2) {
                setView(new x3g(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.v0 = i;
        }
    }
}
