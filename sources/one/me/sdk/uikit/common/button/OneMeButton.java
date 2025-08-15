package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004!*1\u001eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R+\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8F@FX\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u00100\u001a\u00020*2\u0006\u0010\"\u001a\u00020*8F@FX\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u0010\"\u001a\u0002018F@FX\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R/\u0010>\u001a\u0004\u0018\u0001082\b\u0010\"\u001a\u0004\u0018\u0001088F@FX\u0002¢\u0006\u0012\n\u0004\b9\u0010$\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010@\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@FX\u0002¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\rR\u0011\u0010\u0016\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u0002088BX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;R\u0014\u0010J\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeButton;", "Landroid/view/ViewGroup;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Le5f;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "setEndIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "(Ljava/lang/Integer;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "(I)V", "setTextBadge", "Landroid/widget/TextView;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "La7a;", "getInternalType", "()La7a;", "Lc7a;", "<set-?>", "a", "Ls7c;", "getSize", "()Lc7a;", "setSize", "(Lc7a;)V", "size", "Lb7a;", "b", "getMode", "()Lb7a;", "setMode", "(Lb7a;)V", "mode", "Lz6a;", "c", "getAppearance", "()Lz6a;", "setAppearance", "(Lz6a;)V", "appearance", "Lfka;", "o", "getCustomTheme", "()Lfka;", "setCustomTheme", "(Lfka;)V", "customTheme", "s0", "isProgressEnabled", "()Z", "setProgressEnabled", "", "getText", "()Ljava/lang/String;", "getCurrentTheme", "currentTheme", "getVerticalPaddingOffset", "()I", "verticalPaddingOffset", "common_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeButton extends ViewGroup implements kre {
    public static final /* synthetic */ bc7[] B0;
    public boolean A0;
    public final d7a a = new d7a(this, 0);
    public final d7a b = new d7a(this, 1);
    public final d7a c = new d7a(this, 2);
    public final d7a o = new d7a(this, 3);
    public final d7a s0 = new d7a(this, 4);
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final ShapeDrawable y0;
    public final RippleDrawable z0;

    static {
        Class<OneMeButton> cls = OneMeButton.class;
        B0 = new bc7[]{new oi9(cls, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;"), rh4.g(nec.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/button/OneMeButton$Mode;"), new oi9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;"), new oi9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new oi9(cls, "isProgressEnabled", "isProgressEnabled()Z")};
    }

    public OneMeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t0 = tu0.r(3, new y6a(context, this, 0));
        this.u0 = tu0.r(3, new hy4(context, 20));
        this.v0 = tu0.r(3, new hy4(context, 21));
        this.w0 = tu0.r(3, new hy4(context, 22));
        this.x0 = tu0.r(3, new y6a(context, this, 1));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.y0 = shapeDrawable;
        int i = qp4.u0.j(this).d().a.a.d;
        this.z0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        this.A0 = true;
        setClipToOutline(true);
        e();
        j();
    }

    public static final void a(OneMeButton oneMeButton, int i, boolean z) {
        oneMeButton.getClass();
        pk5 pk5 = new pk5(l6d.Z(new at(7, oneMeButton), new wy6(i, 2)));
        while (pk5.hasNext()) {
            ((View) pk5.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final a7a getInternalType() {
        bc7 bc7 = B0[4];
        return ((Boolean) this.s0.b).booleanValue() ? a7a.c : (br7.H(this.u0) == br7.H(this.v0) || br7.H(this.w0)) ? a7a.a : a7a.b;
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    private final void setupTextViewParams(TextView textView) {
        CharSequence text = textView.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextAlignment(4);
    }

    public final int b(int i) {
        int X;
        if (i == xoc.i) {
            return 0;
        }
        if (i == xoc.k) {
            X = l6d.X(lz7.m(this)) / 2;
        } else if (i == xoc.f) {
            return l6d.X(lz7.m(this)) / 2;
        } else {
            if (i != xoc.g) {
                return -1;
            }
            X = l6d.X(lz7.m(this));
        }
        return X - 1;
    }

    public final void c(Integer num, boolean z) {
        je7 je7 = this.x0;
        if (je7.a() || num != null) {
            caa caa = (caa) je7.getValue();
            int i = 0;
            caa.setVisibility(num != null ? 0 : 8);
            if (num != null) {
                i = num.intValue();
            }
            caa.g(i, z);
            g();
            requestLayout();
        }
    }

    public final void d(Integer num, boolean z) {
        ImageView imageView = (ImageView) this.u0.getValue();
        imageView.setId(xoc.i);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.A0 = z;
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void e() {
        h();
        k();
        g();
        i();
        f();
        invalidate();
    }

    public final void f() {
        hv0 c2 = lz7.c(getCurrentTheme(), getMode(), getAppearance(), isEnabled());
        Paint paint = this.y0.getPaint();
        Integer num = c2.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(c2.b);
        RippleDrawable rippleDrawable = this.z0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r5 != defpackage.z6a.c) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r5 = this;
            je7 r0 = r5.x0
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r0.getValue()
            caa r0 = (defpackage.caa) r0
            b7a r1 = r5.getMode()
            z6a r5 = r5.getAppearance()
            int[] r2 = defpackage.jv0.$EnumSwitchMapping$3
            int r1 = r1.ordinal()
            r1 = r2[r1]
            x9a r2 = defpackage.x9a.b
            x9a r3 = defpackage.x9a.X
            r4 = 1
            if (r1 != r4) goto L_0x002c
            z6a r1 = defpackage.z6a.c
            if (r5 == r1) goto L_0x002a
            goto L_0x0049
        L_0x002a:
            r2 = r3
            goto L_0x0049
        L_0x002c:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0047
            if (r5 == r4) goto L_0x0044
            r1 = 2
            if (r5 == r1) goto L_0x0049
            r1 = 3
            if (r5 == r1) goto L_0x002a
            r1 = 4
            if (r5 != r1) goto L_0x003e
            goto L_0x002a
        L_0x003e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0044:
            x9a r2 = defpackage.x9a.o
            goto L_0x0049
        L_0x0047:
            x9a r2 = defpackage.x9a.a
        L_0x0049:
            r0.setAppearance(r2)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.uikit.common.button.OneMeButton.g():void");
    }

    public final z6a getAppearance() {
        bc7 bc7 = B0[2];
        return (z6a) this.c.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = B0[3];
        return (fka) this.o.b;
    }

    public final b7a getMode() {
        bc7 bc7 = B0[1];
        return (b7a) this.b.b;
    }

    public final c7a getSize() {
        bc7 bc7 = B0[0];
        return (c7a) this.a.b;
    }

    public final String getText() {
        je7 je7 = this.w0;
        return je7.a() ? ((TextView) je7.getValue()).getText().toString() : "";
    }

    public final void h() {
        fka currentTheme = getCurrentTheme();
        b7a mode = getMode();
        z6a appearance = getAppearance();
        int ordinal = mode.ordinal();
        int i = -1;
        if (ordinal == 0) {
            int ordinal2 = appearance.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                currentTheme.getIcon();
            } else if (ordinal2 == 2) {
                i = currentTheme.getIcon().b;
            } else if (ordinal2 == 3) {
                currentTheme.getIcon();
            } else if (ordinal2 == 4) {
                i = currentTheme.getIcon().g;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            int ordinal3 = appearance.ordinal();
            if (ordinal3 == 0) {
                i = currentTheme.getIcon().k;
            } else if (ordinal3 == 1) {
                i = currentTheme.getIcon().c;
            } else if (ordinal3 == 2) {
                i = currentTheme.getIcon().f;
            } else if (ordinal3 == 3) {
                i = currentTheme.getIcon().d;
            } else if (ordinal3 == 4) {
                currentTheme.getIcon();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.A0) {
            je7 je7 = this.u0;
            if (je7.a()) {
                ((ImageView) je7.getValue()).setImageTintList(ColorStateList.valueOf(i));
            }
        }
        je7 je72 = this.v0;
        if (je72.a()) {
            ((ImageView) je72.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void i() {
        lfa lfa;
        je7 je7 = this.t0;
        if (je7.a()) {
            nfa nfa = (nfa) je7.getValue();
            b7a mode = getMode();
            z6a appearance = getAppearance();
            int i = jv0.$EnumSwitchMapping$3[mode.ordinal()];
            gfa gfa = afa.a;
            if (i == 1) {
                int i2 = jv0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        gfa = zea.a;
                    } else if (i2 != 4) {
                        if (i2 == 5) {
                            gfa = dfa.a;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            } else if (i == 2 || i == 3 || i == 4) {
                int i3 = jv0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i3 == 1) {
                    gfa = ffa.a;
                } else if (i3 != 2) {
                    cfa cfa = cfa.a;
                    if (i3 == 3 || i3 == 4) {
                        gfa = cfa;
                    } else if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    gfa = bfa.a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            nfa.setAppearance(gfa);
            int i4 = jv0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i4 == 1) {
                lfa = jfa.a;
            } else if (i4 == 2 || i4 == 3) {
                lfa = ifa.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            nfa.setSize(lfa);
        }
    }

    public final void j() {
        iv0 iv0;
        kqe kqe;
        int i;
        lfa lfa;
        setMinimumHeight(lz7.r(getSize()));
        setOutlineProvider(new ix3(lz7.d(getSize())));
        c7a size = getSize();
        int ordinal = getInternalType().ordinal();
        if (ordinal == 0) {
            int ordinal2 = size.ordinal();
            if (ordinal2 == 0) {
                iv0 = new iv0(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal2 == 1) {
                iv0 = new iv0(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal2 == 2) {
                iv0 = new iv0(tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 15) * fk4.d().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int ordinal3 = size.ordinal();
            if (ordinal3 == 0) {
                float f = (float) 6;
                iv0 = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            } else if (ordinal3 == 1) {
                float f2 = (float) 8;
                iv0 = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            } else if (ordinal3 == 2) {
                float f3 = (float) 14;
                iv0 = new iv0(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 2) {
            int ordinal4 = size.ordinal();
            if (ordinal4 == 0) {
                iv0 = new iv0(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal4 == 1) {
                iv0 = new iv0(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal4 == 2) {
                iv0 = new iv0(tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 14) * fk4.d().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = iv0.a;
        setPadding(i2, 0, i2, 0);
        int ordinal5 = getSize().ordinal();
        if (ordinal5 == 0) {
            kqe = i4f.E;
        } else if (ordinal5 == 1) {
            kqe = i4f.D;
        } else if (ordinal5 == 2) {
            kqe = i4f.C;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        je7 je7 = this.w0;
        if (je7.a()) {
            kqe.b((TextView) je7.getValue(), du4.b);
        }
        int ordinal6 = getSize().ordinal();
        if (ordinal6 == 0) {
            i = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        } else if (ordinal6 == 1) {
            i = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        } else if (ordinal6 == 2) {
            i = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        je7 je72 = this.u0;
        if (je72.a()) {
            ImageView imageView = (ImageView) je72.getValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        je7 je73 = this.v0;
        if (je73.a()) {
            ImageView imageView2 = (ImageView) je73.getValue();
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i;
                layoutParams2.height = i;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        je7 je74 = this.t0;
        if (je74.a()) {
            nfa nfa = (nfa) je74.getValue();
            int i3 = jv0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i3 == 1) {
                lfa = jfa.a;
            } else if (i3 == 2 || i3 == 3) {
                lfa = ifa.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            nfa.setSize(lfa);
        }
        requestLayout();
        requestLayout();
        invalidate();
    }

    public final void k() {
        je7 je7 = this.w0;
        if (je7.a()) {
            ((TextView) je7.getValue()).setTextColor(lz7.S(getCurrentTheme(), getMode(), getAppearance(), isEnabled()));
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = (getMeasuredHeight() / 2) + getVerticalPaddingOffset();
        int measuredWidth = getMeasuredWidth();
        int paddingRight = measuredWidth - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        je7 je7 = this.t0;
        if (br7.H(je7)) {
            nfa nfa = (nfa) je7.getValue();
            int measuredHeight2 = nfa.getMeasuredHeight() / 2;
            int i5 = measuredWidth / 2;
            nfa.layout(i5 - (nfa.getMeasuredWidth() / 2), measuredHeight - measuredHeight2, (nfa.getMeasuredWidth() / 2) + i5, measuredHeight + measuredHeight2);
            return;
        }
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        je7 je72 = this.u0;
        if (br7.H(je72)) {
            ImageView imageView = (ImageView) je72.getValue();
            int measuredHeight3 = imageView.getMeasuredHeight() / 2;
            imageView.layout(paddingLeft, measuredHeight - measuredHeight3, imageView.getMeasuredWidth() + paddingLeft, measuredHeight3 + measuredHeight);
            paddingLeft += imageView.getMeasuredWidth() + G;
        }
        je7 je73 = this.v0;
        int i6 = 0;
        int measuredWidth2 = (paddingRight - paddingLeft) - (br7.H(je73) ? ((ImageView) je73.getValue()).getMeasuredWidth() + G : 0);
        je7 je74 = this.w0;
        if (br7.H(je74)) {
            TextView textView = (TextView) je74.getValue();
            int measuredWidth3 = textView.getMeasuredWidth();
            int measuredHeight4 = textView.getMeasuredHeight() / 2;
            je7 je75 = this.x0;
            if (br7.H(je75)) {
                i6 = ((caa) je75.getValue()).getMeasuredWidth() + G;
            }
            int i7 = ((measuredWidth2 - (measuredWidth3 + i6)) / 2) + paddingLeft;
            int i8 = measuredWidth3 + i7;
            textView.layout(i7, measuredHeight - measuredHeight4, i8, measuredHeight4 + measuredHeight);
            if (br7.H(je75)) {
                caa caa = (caa) je75.getValue();
                int measuredHeight5 = caa.getMeasuredHeight() / 2;
                caa.layout(G + i8, measuredHeight - measuredHeight5, i8 + i6, measuredHeight5 + measuredHeight);
            }
        }
        if (br7.H(je73)) {
            ImageView imageView2 = (ImageView) je73.getValue();
            int measuredHeight6 = imageView2.getMeasuredHeight() / 2;
            imageView2.layout(paddingRight - imageView2.getMeasuredWidth(), measuredHeight - measuredHeight6, paddingRight, measuredHeight + measuredHeight6);
        }
    }

    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        je7 je7 = this.t0;
        if (br7.H(je7)) {
            nfa nfa = (nfa) je7.getValue();
            measureChild(nfa, i, i2);
            setMeasuredDimension(View.resolveSizeAndState(nfa.getMeasuredWidth() + paddingLeft, i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, nfa.getMeasuredHeight()), i2, 0), getMinimumHeight()));
            return;
        }
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        je7 je72 = this.u0;
        boolean H = br7.H(je72);
        je7 je73 = this.w0;
        je7 je74 = this.x0;
        je7 je75 = this.v0;
        if (H) {
            ImageView imageView = (ImageView) je72.getValue();
            measureChild(imageView, i, i2);
            paddingLeft += (br7.H(je75) || br7.H(je74) || br7.H(je73)) ? imageView.getMeasuredWidth() + G : imageView.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView.getMeasuredHeight());
        }
        if (br7.H(je75)) {
            ImageView imageView2 = (ImageView) je75.getValue();
            measureChild(imageView2, i, i2);
            paddingLeft += imageView2.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView2.getMeasuredHeight());
        }
        if (br7.H(je74)) {
            caa caa = (caa) je74.getValue();
            measureChild(caa, i, i2);
            paddingLeft += br7.H(je75) ? caa.getMeasuredWidth() + G : caa.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, caa.getMeasuredHeight());
        }
        if (br7.H(je73)) {
            TextView textView = (TextView) je73.getValue();
            measureChild(textView, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - paddingLeft, Integer.MIN_VALUE), i2);
            setMeasuredDimension(View.resolveSizeAndState(paddingLeft + ((br7.H(je74) || br7.H(je75)) ? G + textView.getMeasuredWidth() : textView.getMeasuredWidth()), i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, textView.getMeasuredHeight()), i2, 0), getMinimumHeight()));
            return;
        }
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i, 0), Math.max(View.resolveSizeAndState(paddingBottom, i2, 0), getMinimumHeight()));
    }

    public final void onThemeChanged(fka fka) {
        e();
        je7 je7 = this.x0;
        if (je7.a()) {
            ((caa) je7.getValue()).f(fka);
        }
    }

    public final void setAppearance(z6a z6a) {
        this.c.o1(this, B0[2], z6a);
    }

    public final void setCustomTheme(fka fka) {
        this.o.o1(this, B0[3], fka);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f();
        k();
        invalidate();
    }

    public final void setEndIcon(Drawable drawable) {
        ImageView imageView = (ImageView) this.v0.getValue();
        imageView.setId(xoc.g);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        imageView.setVisibility(drawable == null ? 8 : 0);
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void setMode(b7a b7a) {
        this.b.o1(this, B0[1], b7a);
    }

    public final void setProgressEnabled(boolean z) {
        this.s0.o1(this, B0[4], Boolean.valueOf(z));
    }

    public final void setSize(c7a c7a) {
        this.a.o1(this, B0[0], c7a);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.w0.getValue();
        textView.setId(xoc.k);
        textView.setText(charSequence);
        setupTextViewParams(textView);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }

    public final void setTextBadge(CharSequence charSequence) {
        je7 je7 = this.x0;
        if (je7.a() || (charSequence != null && !w9e.C0(charSequence))) {
            caa caa = (caa) je7.getValue();
            int i = 0;
            if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
                i = 8;
            }
            caa.setVisibility(i);
            if (charSequence != null) {
                caa.setText(charSequence.toString());
            }
            g();
        }
    }

    public final void setEndIcon(Integer num) {
        ImageView imageView = (ImageView) this.v0.getValue();
        imageView.setId(xoc.g);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        br7.b(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void setText(int i) {
        TextView textView = (TextView) this.w0.getValue();
        textView.setId(xoc.k);
        textView.setText(i);
        setupTextViewParams(textView);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }
}
