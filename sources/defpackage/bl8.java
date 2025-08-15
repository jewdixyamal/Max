package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: bl8  reason: default package */
public abstract class bl8 extends ppe implements mc8 {
    public static final /* synthetic */ bc7[] B0;
    public final yj A0 = new yj(12, this);

    static {
        oi9 oi9 = new oi9(bl8.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        nec.a.getClass();
        B0 = new bc7[]{oi9};
    }

    public bl8(Context context) {
        super(context);
    }

    public void a(f53 f53) {
        setModel(f53);
    }

    public x38 getModel() {
        bc7 bc7 = B0[0];
        return (x38) this.A0.b;
    }

    public void i(bsd bsd) {
        setModel(bsd);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f = (float) 10;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        int i7 = 0;
        if (br7.H(getSenderNameViewStub$message_list_release().b)) {
            int G2 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            getSenderNameViewStub$message_list_release().c(G, G2);
            i5 = getSenderNameViewStub$message_list_release().a() + G2;
        } else {
            i5 = 0;
        }
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - G) - getSenderAliasDelegate().L(), rh4.c((float) 8, fk4.d().getDisplayMetrics().density, (getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            int G3 = i5 + tu0.G((i5 == 0 ? (float) 8 : (float) 4) * fk4.d().getDisplayMetrics().density);
            getMessageLinkDelegate().T(G, G3);
            i5 = G3 + getMessageLinkDelegate().K();
        }
        if (w()) {
            float f2 = (float) 1;
            int G4 = tu0.G(fk4.d().getDisplayMetrics().density * f2) + (i5 == 0 ? 0 : rh4.c((float) 8, fk4.d().getDisplayMetrics().density, i5));
            int c = rh4.c((float) 6, fk4.d().getDisplayMetrics().density, b(tu0.G(f2 * fk4.d().getDisplayMetrics().density), G4) + G4);
            ote.E(getMessageTextView$message_list_release(), G, c, 0, 12);
            i6 = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + c);
        } else {
            int c2 = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, i5);
            ote.E(getMessageTextView$message_list_release(), G, c2, 0, 12);
            float f3 = (float) 1;
            int d = wg0.d(f3, fk4.d().getDisplayMetrics().density, tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), getMessageTextView$message_list_release().getMeasuredHeight() + c2);
            i6 = d + b(tu0.G(f3 * fk4.d().getDisplayMetrics().density), d);
        }
        int measuredWidth = getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth();
        if (!w()) {
            f = (float) 4;
        }
        ote.E(getDate$message_list_release(), measuredWidth - tu0.G(f * fk4.d().getDisplayMetrics().density), ((w() ? getMeasuredHeight() : i6) - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
        if (br7.H((je7) getReactionsDelegate().c) && w()) {
            getReactionsDelegate().T(G, i6);
        } else if (br7.H((je7) getReactionsDelegate().c)) {
            int c3 = rh4.c((float) 4, fk4.d().getDisplayMetrics().density, i6);
            r6c reactionsDelegate = getReactionsDelegate();
            if (getReactionsDelegate().Z) {
                i7 = getMeasuredWidth() - getReactionsDelegate().L();
            }
            reactionsDelegate.T(i7, c3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().h();
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(rh4.c(f, fk4.d().getDisplayMetrics().density, getSuggestedMinimumWidth()), (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        int i4 = 0;
        if (br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().h0());
            i3 = getSenderNameViewStub$message_list_release().a() + tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        } else {
            i3 = 0;
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageLinkDelegate().L());
            i3 += getMessageLinkDelegate().K() + tu0.G((i3 == 0 ? (float) 8 : (float) 4) * fk4.d().getDisplayMetrics().density);
        }
        if (i3 != 0 && w()) {
            i4 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        }
        int i5 = i3 + i4;
        getDate$message_list_release().measure(i, i2);
        if (br7.H((je7) getReactionsDelegate().c) && w()) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getReactionsDelegate().L());
            i5 = wg0.d(f, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K(), i5);
        } else if (br7.H((je7) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, getReactionsDelegate().L());
            int c = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K() + tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
            i5 += c;
            ((vs8) getBackground()).w = (float) c;
        } else {
            ((vs8) getBackground()).w = 0.0f;
        }
        int max = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        float f2 = (float) 6;
        int d = wg0.d((float) 8, fk4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + tu0.G(fk4.d().getDisplayMetrics().density * f2), i5);
        if (w()) {
            int L = br7.H((je7) getReactionsDelegate().c) ? getReactionsDelegate().L() : getMessageTextView$message_list_release().e(m);
            int measuredWidth = getDate$message_list_release().getMeasuredWidth() + tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            if (m - L < measuredWidth) {
                d = rh4.c((float) 12, fk4.d().getDisplayMetrics().density, d);
            } else if ((max - (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2)) - L < measuredWidth) {
                max += measuredWidth - ((max - (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2)) - L);
            }
        }
        float f3 = (float) 1;
        long t = t(max, wg0.m(f3, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(max, (tu0.G(fk4.d().getDisplayMetrics().density * f3) * 2) + ((int) (t >> 32))), (tu0.G(f3 * fk4.d().getDisplayMetrics().density) * 2) + ((int) (t & 4294967295L)) + d);
    }

    public void p(vqd vqd) {
        setModel(vqd);
    }

    public void setModel(x38 x38) {
        this.A0.o1(this, B0[0], x38);
    }

    public final boolean w() {
        x38 model = getModel();
        return model != null && model.c();
    }

    public final void x(is0 is0) {
        if (w()) {
            getDate$message_list_release().setTextColor$message_list_release(is0.d.m);
        }
    }
}
