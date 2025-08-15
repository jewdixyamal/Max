package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: vja  reason: default package */
public final class vja extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] v0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final uja s0 = new uja(this);
    public final uja t0 = new uja((y5a) y5a.g.getValue(), this);
    public zie u0 = br7.Y(getTabItem().c, qp4.u0.j(this));

    static {
        Class<vja> cls = vja.class;
        v0 = new bc7[]{new oi9(cls, "isIndicatorVisible", "isIndicatorVisible()Z"), rh4.g(nec.a, cls, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;")};
    }

    public vja(Context context) {
        super(context, (AttributeSet) null);
        this.a = tu0.r(3, new xda(context, 7));
        this.b = tu0.r(3, new xda(context, 8));
        this.c = tu0.r(3, new xda(context, 9));
        this.o = tu0.r(3, new yf3(context, 29, this));
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    public static final void a(vja vja) {
        vja.setText(vja.getTabItem().b);
        vja.u0 = br7.Y(vja.getTabItem().c, qp4.u0.j(vja));
        Drawable drawable = vja.getTabItem().e;
        je7 je7 = vja.b;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7.getValue();
            imageView.setImageDrawable(drawable);
            br7.b(vja, imageView, Integer.valueOf(vja.b(imageView.getId())));
        }
        bc7 bc7 = v0[0];
        boolean booleanValue = ((Boolean) vja.s0.b).booleanValue();
        je7 je72 = vja.o;
        je7 je73 = vja.c;
        if (booleanValue) {
            np8 np8 = vja.getTabItem().d;
            if (np8 instanceof v5a) {
                caa caa = (caa) je73.getValue();
                br7.b(vja, caa, Integer.valueOf(vja.b(caa.getId())));
            } else {
                int i = 8;
                if (tpa.f(np8, w5a.p)) {
                    qaa qaa = (qaa) je72.getValue();
                    if (vja.u0.d) {
                        i = 0;
                    }
                    qaa.setVisibility(i);
                    br7.b(vja, qaa, Integer.valueOf(vja.b(qaa.getId())));
                } else if (tpa.f(np8, x5a.p)) {
                    if (je72.a()) {
                        ((qaa) je72.getValue()).setVisibility(8);
                    }
                    if (je73.a()) {
                        ((caa) je73.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        vja.c();
        boolean a2 = je7.a();
        je7 je74 = vja.a;
        if (a2) {
            ImageView imageView2 = (ImageView) je7.getValue();
            if (imageView2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(tu0.G(((br7.H(je74) || br7.H(je72) || br7.H(je73)) ? (float) 4 : (float) 0) * fk4.d().getDisplayMetrics().density));
                    imageView2.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        if (je74.a()) {
            TextView textView = (TextView) je74.getValue();
            if (textView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(tu0.G(((br7.H(je72) || br7.H(je73)) ? (float) 4 : (float) 0) * fk4.d().getDisplayMetrics().density));
                    textView.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        vja.requestLayout();
        vja.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.a.getValue();
        textView.setText(charSequence);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == xoc.z0) {
            return 0;
        }
        if (i == xoc.B0) {
            return l6d.X(lz7.m(this)) / 2;
        }
        if (i == xoc.A0) {
            return l6d.X(lz7.m(this)) - 1;
        }
        return -1;
    }

    public final void c() {
        je7 je7 = this.a;
        if (je7.a()) {
            ((TextView) je7.getValue()).setTextColor(this.u0.b);
        }
        je7 je72 = this.b;
        if (je72.a()) {
            ((ImageView) je72.getValue()).setImageTintList(ColorStateList.valueOf(this.u0.a));
        }
        int i = 0;
        bc7 bc7 = v0[0];
        if (((Boolean) this.s0.b).booleanValue()) {
            np8 np8 = getTabItem().d;
            boolean f = tpa.f(np8, w5a.p);
            je7 je73 = this.o;
            if (!f) {
                boolean z = np8 instanceof v5a;
                je7 je74 = this.c;
                if (z) {
                    boolean z2 = this.u0.d && ((v5a) np8).p != 0;
                    if (je74.a()) {
                        caa caa = (caa) je74.getValue();
                        if (!z2) {
                            i = 8;
                        }
                        caa.setVisibility(i);
                        int s = au1.s(getTabItem().c);
                        x9a x9a = x9a.a;
                        if (s != 0) {
                            if (s == 1) {
                                x9a = x9a.c;
                            } else if (s != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        caa.setAppearance(x9a);
                        caa.g(((v5a) np8).p, true);
                    }
                } else if (tpa.f(np8, x5a.p)) {
                    if (je74.a()) {
                        ((caa) je74.getValue()).setVisibility(8);
                    }
                    if (je73.a()) {
                        ((qaa) je73.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (je73.a()) {
                qaa qaa = (qaa) je73.getValue();
                if (!this.u0.d) {
                    i = 8;
                }
                qaa.setVisibility(i);
            }
        }
    }

    public final y5a getTabItem() {
        bc7 bc7 = v0[1];
        return (y5a) this.t0.b;
    }

    public final void onThemeChanged(fka fka) {
        this.u0 = br7.Y(getTabItem().c, fka);
        c();
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setIndicatorVisible(boolean z) {
        this.s0.o1(this, v0[0], Boolean.valueOf(z));
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(y5a.a(getTabItem(), (CharSequence) null, z ? 1 : 2, (v5a) null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(y5a y5a) {
        this.t0.o1(this, v0[1], y5a);
    }
}
