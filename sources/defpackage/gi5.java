package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: gi5  reason: default package */
public final class gi5 extends ppe {
    public static final /* synthetic */ bc7[] W0;
    public int A0;
    public final je7 B0;
    public boolean C0;
    public boolean D0;
    public o50 E0;
    public x77 F0;
    public final yj G0 = new yj(9, this);
    public final Rect H0 = new Rect();
    public final je7 I0 = tu0.r(3, new di5(this, 0));
    public final je7 J0 = tu0.r(3, new di5(this, 1));
    public final je7 K0 = tu0.r(3, new di5(this, 2));
    public final ShapeDrawable L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final OneMeDraweeView R0;
    public final TextView S0;
    public Layout T0;
    public final int U0;
    public final int V0;

    static {
        oi9 oi9 = new oi9(gi5.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;");
        nec.a.getClass();
        W0 = new bc7[]{oi9};
    }

    public gi5(Context context) {
        super(context);
        pq9 pq9 = qp4.u0;
        int i = pq9.j(this).a().d(true).a.i;
        this.A0 = pq9.j(this).a().d(true).b.f;
        this.B0 = tu0.r(3, new hy4(context, 5));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.L0 = shapeDrawable;
        this.M0 = tu0.r(3, new ei5(context, this, 0));
        this.N0 = tu0.r(3, new ei5(context, this, 1));
        this.O0 = tu0.r(3, new ei5(context, this, 2));
        this.P0 = tu0.r(3, new ei5(context, this, 3));
        this.Q0 = tu0.r(3, new fh5(3));
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.R0 = oneMeDraweeView;
        TextView textView = new TextView(context);
        os2.f.b(textView, du4.b);
        textView.setMaxLines(1);
        this.S0 = textView;
        this.U0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        this.V0 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7 = vs8.y;
        fka j = pq9.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final ch5 getActionIconView() {
        return (ch5) this.M0.getValue();
    }

    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.N0.getValue();
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.B0.getValue();
    }

    private final ix3 getCornersOutlineProvider() {
        return (ix3) this.Q0.getValue();
    }

    private final zf5 getModel() {
        bc7 bc7 = W0[0];
        return (zf5) this.G0.b;
    }

    private final int getPreviewActionIconBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final int getPreviewActionIconColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    private final void setModel(zf5 zf5) {
        this.G0.o1(this, W0[0], zf5);
    }

    private final void setPreview(zf5 zf5) {
        zf5 zf52 = zf5;
        yt6 yt6 = zf52.k;
        wcf wcf = zf52.l;
        if (!(yt6 == null && wcf == null) && !zf52.m) {
            if (yt6 == null) {
                yt6 = wcf != null ? new yt6(0, wcf.b, wcf.c, wcf.d, false, wcf.e, false, wcf.h, (jic) null, (String) null, (Uri) null, 3840) : null;
            }
            je7 je7 = this.P0;
            ((View) je7.getValue()).setVisibility(zf52.j == 2 ? 0 : 8);
            if (br7.H(je7)) {
                mdf mdf = (mdf) je7.getValue();
                if (wcf != null) {
                    long e = ft4.e(wcf.f);
                    String[] strArr = are.b;
                    mdf.setContent(tfg.c(e));
                }
            }
            if (yt6 != null) {
                bu6 bu6 = (bu6) this.O0.getValue();
                bu6.setVisibility(0);
                bu6.setImageAttach(yt6);
                OneMeDraweeView oneMeDraweeView = this.R0;
                xv6 d = xv6.d(yt6.b);
                d.d = yt6.i;
                d.l = getBlurPostProcessor();
                oneMeDraweeView.o(d.a(), (wv6) null);
                ((la6) oneMeDraweeView.getHierarchy()).h(yt6.j);
            }
        }
    }

    private final void setSubtitle(jqe jqe) {
        if (jqe != null) {
            this.S0.setText(jqe.b(getContext()));
        }
    }

    public static Drawable w(gi5 gi5) {
        int i = woc.m0;
        int previewActionIconColor = gi5.getPreviewActionIconColor();
        Drawable b = kt3.b(gi5.getContext(), i);
        ngg.G(b, previewActionIconColor);
        return b;
    }

    public static final void x(gi5 gi5, boolean z) {
        zf5 model = gi5.getModel();
        if (model != null) {
            gi5.T0 = model.e;
            gi5.setSubtitle(model.g);
            gi5.setPreview(model);
            boolean z2 = !z;
            gi5.getMessageTextView$message_list_release().setVisibility(model.m ? 0 : 8);
            boolean z3 = gi5.D0;
            je7 je7 = gi5.N0;
            j0e j0e = model.n;
            yf5 yf5 = model.i;
            if (z3) {
                je7 je72 = gi5.M0;
                if (je72.a()) {
                    ((ch5) je72.getValue()).setVisibility(8);
                }
                gi5.getBigPreviewActionIcon().setVisibility(0);
                if (yf5 instanceof xf5) {
                    gi5.C(je7);
                } else if (yf5 instanceof vf5) {
                    gi5.A(je7);
                } else if (j0e.getValue() == null && (yf5 instanceof wf5)) {
                    gi5.B(je7, ((wf5) yf5).a);
                }
            } else {
                if (je7.a()) {
                    ((ImageView) je7.getValue()).setVisibility(8);
                }
                je7 je73 = gi5.O0;
                if (je73.a()) {
                    ((bu6) je73.getValue()).setVisibility(8);
                }
                gi5.R0.setVisibility(8);
                gi5.getActionIconView().setVisibility(0);
                boolean z4 = yf5 instanceof xf5;
                uf5 uf5 = model.f;
                if (z4) {
                    gi5.getActionIconView().d(uf5, z2);
                } else if (yf5 instanceof vf5) {
                    gi5.getActionIconView().b(uf5, z2);
                } else if (j0e.getValue() != null || !(yf5 instanceof wf5)) {
                    ch5 actionIconView = gi5.getActionIconView();
                    ph5 ph5 = actionIconView.o;
                    ph5.a(uf5);
                    uf5 uf52 = ph5.c;
                    if (uf52 != null) {
                        int c = qp4.u0.j(actionIconView).a().c(uf52.b().o);
                        actionIconView.c.c(c, c);
                    }
                } else {
                    gi5.getActionIconView().c(uf5, ((wf5) yf5).a, z2);
                }
            }
        }
    }

    public final void A(je7 je7) {
        if (je7.a()) {
            ImageView imageView = (ImageView) je7.getValue();
            zf5 model = getModel();
            int i = 0;
            if ((model != null ? model.j : 0) == 2) {
                Drawable drawable = (Drawable) this.J0.getValue();
                ngg.G(drawable, getPreviewActionIconColor());
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.L0);
            }
            zf5 model2 = getModel();
            if ((model2 != null ? model2.j : 0) != 2) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void B(je7 je7, float f) {
        Drawable drawable = (Drawable) this.K0.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) je7.getValue();
        if (!(imageView.getDrawable() instanceof a10)) {
            a10 a10 = new a10();
            a10.a = drawable;
            a10.invalidateSelf();
            a10.p.setColor(previewActionIconColor);
            a10.invalidateSelf();
            a10.e = true;
            a10.invalidateSelf();
            imageView.setImageDrawable(a10);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * ((float) 100)));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void C(je7 je7) {
        ImageView imageView = (ImageView) je7.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.I0.getValue();
        ngg.G(drawable, getPreviewActionIconColor());
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.L0);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void D(zf5 zf5) {
        setModel(zf5);
    }

    public final void E(b00 b00) {
        zf5 model;
        uf5 uf5;
        if (b00 != null && (model = getModel()) != null && b00.a() == model.b) {
            setSubtitle(b00.b());
            boolean z = this.D0;
            je7 je7 = this.N0;
            if (z) {
                je7 je72 = this.M0;
                if (je72.a()) {
                    ((ch5) je72.getValue()).setVisibility(8);
                }
                getBigPreviewActionIcon().setVisibility(0);
                if (b00 instanceof xz) {
                    B(je7, ((xz) b00).b);
                } else if (b00 instanceof a00) {
                    B(je7, ((a00) b00).b);
                } else if (b00 instanceof yz) {
                    C(je7);
                } else if (b00 instanceof zz) {
                    A(je7);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (je7.a()) {
                    ((ImageView) je7.getValue()).setVisibility(8);
                }
                je7 je73 = this.O0;
                if (je73.a()) {
                    ((bu6) je73.getValue()).setVisibility(8);
                }
                this.R0.setVisibility(8);
                getActionIconView().setVisibility(0);
                zf5 model2 = getModel();
                if (model2 == null || (uf5 = model2.f) == null) {
                    uf5 = tf5.c;
                }
                if (b00 instanceof xz) {
                    getActionIconView().c(uf5, ((xz) b00).b, true);
                } else if (b00 instanceof a00) {
                    getActionIconView().c(uf5, ((a00) b00).b, true);
                } else if (b00 instanceof yz) {
                    getActionIconView().d(uf5, true);
                } else if (b00 instanceof zz) {
                    getActionIconView().b(uf5, true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        Layout layout = this.T0;
        if (layout != null) {
            View z = br7.z(this.M0);
            if (z != null) {
                i = getContentHorizontalPadding$message_list_release() + z.getMeasuredWidth();
            } else {
                i = 0;
            }
            int i2 = this.U0 + i;
            int save = canvas.save();
            canvas.translate((float) i2, (float) (this.S0.getTop() - layout.getHeight()));
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void g(CharSequence charSequence, boolean z) {
        j34 date$message_list_release = getDate$message_list_release();
        bc7[] bc7Arr = j34.D0;
        date$message_list_release.c(charSequence, false);
    }

    public final boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.C0 && mpf.c(this.R0, this).contains(x, y)) {
            return true;
        }
        je7 je7 = this.O0;
        if (!br7.H(je7) || !mpf.c((View) je7.getValue(), this).contains(x, y)) {
            return this.H0.contains(x, y);
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int G = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        float f = (float) 4;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        boolean H = br7.H(getSenderNameViewStub$message_list_release().b);
        int i10 = this.U0;
        if (H) {
            getSenderNameViewStub$message_list_release().c(i10, i10);
            i5 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i10;
        } else {
            i5 = i10;
        }
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - i10) - getSenderAliasDelegate().L(), ((getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)) + i10);
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().T(i10, i5);
            i5 += getMessageLinkDelegate().K() + G2;
        }
        zf5 model = getModel();
        int i11 = this.V0;
        if (model != null && model.m) {
            dy8 messageTextView$message_list_release = getMessageTextView$message_list_release();
            ote.E(messageTextView$message_list_release, i10, i5, 0, 12);
            i5 += messageTextView$message_list_release.getMeasuredHeight() + i11;
        }
        boolean z2 = this.C0;
        OneMeDraweeView oneMeDraweeView = this.R0;
        if (z2) {
            oneMeDraweeView.layout(i10, i5, oneMeDraweeView.getMeasuredWidth() + i10, oneMeDraweeView.getMeasuredHeight() + i5);
        }
        je7 je7 = this.O0;
        if (br7.H(je7)) {
            bu6 bu6 = (bu6) je7.getValue();
            if (this.C0) {
                i9 = bu6.getMeasuredLayoutHeight() != bu6.getMeasuredHeight() ? ((bu6.getMeasuredLayoutHeight() - bu6.getMeasuredHeight()) / 2) + i5 : i5;
                i8 = bu6.getMeasuredLayoutWidth() != bu6.getMeasuredWidth() ? ((bu6.getMeasuredLayoutWidth() - bu6.getMeasuredWidth()) / 2) + i10 : i10;
            } else {
                i8 = i10;
                i9 = i5;
            }
            ote.E(bu6, i8, i9, 0, 12);
            if (this.C0) {
                oneMeDraweeView.setOutlineProvider(getCornersOutlineProvider());
                bu6.setOutlineProvider(getCornersOutlineProvider());
            } else {
                bu6.setOutlineProvider(getCornersOutlineProvider());
            }
        }
        je7 je72 = this.N0;
        if (br7.H(je72)) {
            ImageView imageView = (ImageView) je72.getValue();
            int measuredLayoutWidth = (((bu6) je7.getValue()).getMeasuredLayoutWidth() / 2) + i10;
            int measuredLayoutHeight = (((bu6) je7.getValue()).getMeasuredLayoutHeight() / 2) + i5;
            ote.D(imageView, measuredLayoutWidth - (imageView.getMeasuredWidth() / 2), measuredLayoutHeight - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + measuredLayoutWidth, (imageView.getMeasuredHeight() / 2) + measuredLayoutHeight);
        }
        if (br7.H(je7)) {
            je7 je73 = this.P0;
            if (br7.H(je73)) {
                mdf mdf = (mdf) je73.getValue();
                ote.E(mdf, rh4.c(f, fk4.d().getDisplayMetrics().density, i10), rh4.q(f, fk4.d().getDisplayMetrics().density, (((bu6) je7.getValue()).getMeasuredLayoutHeight() + i5) - mdf.getMeasuredHeight()), 0, 12);
            }
            i5 += ((bu6) je7.getValue()).getMeasuredLayoutHeight() + i11;
        }
        je7 je74 = this.M0;
        if (br7.H(je74)) {
            ch5 ch5 = (ch5) je74.getValue();
            if (br7.H((je7) getReactionsDelegate().c)) {
                if (getMeasuredWidth() - (getReactionsDelegate().L() + (i10 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                    i7 = rh4.c((float) 6, fk4.d().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight() + rh4.c((float) 10, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K()));
                    ote.E(ch5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (ch5.getMeasuredHeight() / 2), 0, 12);
                    i6 = getContentHorizontalPadding$message_list_release() + G + i10;
                }
            }
            i7 = br7.H((je7) getReactionsDelegate().c) ? rh4.c((float) 8, fk4.d().getDisplayMetrics().density, rh4.c((float) 10, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K())) : i10;
            ote.E(ch5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (ch5.getMeasuredHeight() / 2), 0, 12);
            i6 = getContentHorizontalPadding$message_list_release() + G + i10;
        } else {
            i6 = i10;
        }
        int G3 = br7.H(je74) ? tu0.G(getActionIconView().getY() + ((float) (getActionIconView().getMeasuredHeight() / 2))) : (G / 2) + i5;
        TextView textView = this.S0;
        ote.D(textView, i6, G3, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight() + G3);
        Math.max(nu0.q(this.T0), textView.getMeasuredWidth());
        int bottom = br7.H(je74) ? ((ch5) je74.getValue()).getBottom() : textView.getBottom();
        if (br7.H((je7) getReactionsDelegate().c)) {
            float f2 = (float) 10;
            getReactionsDelegate().T(tu0.G(f2 * fk4.d().getDisplayMetrics().density), rh4.c(f2, fk4.d().getDisplayMetrics().density, bottom));
            getReactionsDelegate().K();
        }
        ote.E(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - i10, rh4.q(f, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - getDate$message_list_release().getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        int i5 = i;
        int i6 = i2;
        float f2 = (float) 10;
        int m = wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int G = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list_release();
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i6);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        boolean H = br7.H(getSenderNameViewStub$message_list_release().b);
        int i7 = this.U0;
        if (H) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i6);
            int h0 = getSenderAliasDelegate().h0();
            i3 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i7;
            size = Math.max(size, (i7 * 2) + getSenderNameViewStub$message_list_release().b() + h0);
        } else {
            i3 = i7;
        }
        zf5 model = getModel();
        int i8 = this.V0;
        if (model != null && model.m) {
            dy8 messageTextView$message_list_release = getMessageTextView$message_list_release();
            messageTextView$message_list_release.h();
            size = Math.max(size, (i7 * 2) + messageTextView$message_list_release.getMeasuredWidth());
            i3 += messageTextView$message_list_release.getMeasuredHeight() + i8;
        }
        je7 je7 = this.O0;
        boolean H2 = br7.H(je7);
        OneMeDraweeView oneMeDraweeView = this.R0;
        if (H2) {
            bu6 bu6 = (bu6) je7.getValue();
            int i9 = i7 * 2;
            f = f2;
            bu6.measure(View.MeasureSpec.makeMeasureSpec(m - i9, 1073741824), i6);
            i3 += bu6.getMeasuredLayoutHeight() + i8;
            size = Math.max(size, bu6.getMeasuredLayoutWidth() + i9);
            boolean z = (bu6.getMeasuredLayoutWidth() == bu6.getMeasuredWidth() && bu6.getMeasuredLayoutHeight() == bu6.getMeasuredHeight()) ? false : true;
            this.C0 = z;
            oneMeDraweeView.setVisibility(z ? 0 : 8);
        } else {
            f = f2;
        }
        if (this.C0) {
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(m - (i7 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(((bu6) je7.getValue()).getMeasuredLayoutHeight(), 1073741824));
        }
        je7 je72 = this.N0;
        if (je72.a()) {
            ((ImageView) je72.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G2, 1073741824), View.MeasureSpec.makeMeasureSpec(G2, 1073741824));
        }
        boolean H3 = br7.H(je7);
        je7 je73 = this.M0;
        if (H3) {
            i4 = Math.min(m, ((bu6) je7.getValue()).getMeasuredWidth());
        } else {
            Integer valueOf = Integer.valueOf(getContentHorizontalPadding$message_list_release() + G);
            if (!br7.H(je73)) {
                valueOf = 0;
            }
            i4 = (m - valueOf.intValue()) - (i7 * 2);
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i6);
            size = Math.max(size, (i7 * 2) + getMessageLinkDelegate().L());
            i3 += getMessageLinkDelegate().K() + G3;
        }
        getDate$message_list_release().measure(i5, i6);
        je7 je74 = this.P0;
        if (je74.a()) {
            ((mdf) je74.getValue()).measure(i5, i6);
        }
        if (je73.a()) {
            ((ch5) je73.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G, 1073741824), View.MeasureSpec.makeMeasureSpec(G, 1073741824));
        }
        TextView textView = this.S0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i6);
        int max = Math.max(nu0.q(this.T0), textView.getMeasuredWidth());
        if (!br7.H(je7)) {
            size = Math.max(size, getContentHorizontalPadding$message_list_release() + (i7 * 2) + max + G);
        }
        int contentHorizontalPadding$message_list_release = (size - i7) - getContentHorizontalPadding$message_list_release();
        Integer valueOf2 = Integer.valueOf(G);
        Integer valueOf3 = Integer.valueOf(textView.getMeasuredHeight() + nu0.p(this.T0));
        if (!br7.H(je73)) {
            valueOf2 = valueOf3;
        }
        this.H0.set(i7, i3, contentHorizontalPadding$message_list_release, valueOf2.intValue() + i3);
        int measuredHeight = textView.getMeasuredHeight() + nu0.p(this.T0);
        Integer valueOf4 = Integer.valueOf(G);
        Integer valueOf5 = Integer.valueOf(measuredHeight);
        if (!br7.H(je73)) {
            valueOf4 = valueOf5;
        }
        int max2 = Math.max(valueOf4.intValue(), measuredHeight) + i3;
        if (br7.H((je7) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i6);
            max2 = wg0.d(f, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K(), max2);
            size = Math.max(size, (i7 * 2) + getReactionsDelegate().L());
        }
        if (br7.H((je7) getReactionsDelegate().c)) {
            if (size - (getReactionsDelegate().L() + (i7 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                max2 += rh4.c((float) 6, fk4.d().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight()) - tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            }
        }
        int q = nu0.q(this.T0) - textView.getMeasuredWidth();
        if (!br7.H((je7) getReactionsDelegate().c) && q < getDate$message_list_release().getMeasuredWidth()) {
            size += (tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) + getDate$message_list_release().getMeasuredWidth()) - q;
        }
        if (br7.H((je7) getReactionsDelegate().c)) {
            i7 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, max2 + i7);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        getDate$message_list_release().setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        getDate$message_list_release().setStatus$message_list_release(zof);
    }

    public final void setFileInfo(zf5 zf5) {
        o50 o50;
        setModel(zf5);
        this.E0 = new o50(this, 2, zf5);
        if (isAttachedToWindow() && (o50 = this.E0) != null) {
            o50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.E0);
    }

    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list_release().e(layout);
    }

    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list_release().f(i);
    }

    public final void y(is0 is0) {
        TextPaint paint;
        int i = is0.a.i;
        this.A0 = is0.b.f;
        je7 je7 = this.I0;
        boolean a = je7.a();
        pq9 pq9 = qp4.u0;
        if (a) {
            pq9.j(this).a().s().c.getClass();
            ngg.G((Drawable) je7.getValue(), -1);
        }
        je7 je72 = this.K0;
        if (je72.a()) {
            pq9.j(this).a().s().c.getClass();
            ngg.G((Drawable) je72.getValue(), -1);
        }
        Layout layout = this.T0;
        ls0 ls0 = is0.d;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(ls0.e);
        }
        this.S0.setTextColor(ls0.f);
        je7 je73 = this.M0;
        if (je73.a()) {
            ch5 ch5 = (ch5) je73.getValue();
            ch5.a = is0;
            fka j = pq9.j(ch5);
            ph5 ph5 = ch5.o;
            ph5.onThemeChanged(j);
            uf5 uf5 = ph5.c;
            if (uf5 != null) {
                int c = pq9.j(ch5).a().c(uf5.b().o);
                ch5.c.c(c, c);
            }
        }
        je7 je74 = this.N0;
        boolean a2 = je74.a();
        ShapeDrawable shapeDrawable = this.L0;
        if (a2) {
            ImageView imageView = (ImageView) je74.getValue();
            if (imageView.getDrawable() instanceof a10) {
                Drawable drawable = imageView.getDrawable();
                a10 a10 = drawable instanceof a10 ? (a10) drawable : null;
                if (a10 != null) {
                    a10.p.setColor(this.A0);
                    a10.invalidateSelf();
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list_release().setTextColor$message_list_release(ls0.m);
        invalidate();
    }

    public final void z() {
        removeOnAttachStateChangeListener(this.E0);
        x77 x77 = this.F0;
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        this.F0 = null;
        setModel((zf5) null);
    }
}
