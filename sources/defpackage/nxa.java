package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: nxa  reason: default package */
public final class nxa extends ppd {
    public final mxa X;
    public final int Y;

    public nxa(mxa mxa, ExecutorService executorService, int i) {
        super(executorService);
        this.X = mxa;
        this.Y = i;
    }

    /* renamed from: J */
    public final void r(qxa qxa, int i) {
        qxa qxa2 = qxa;
        pxa pxa = (pxa) ((ol7) C(i));
        v59 v59 = new v59(2, this.X, mxa.class, "onItemClick", "onItemClick(JLone/me/chats/picker/PickerEntity$Type;)V", 0, 4);
        v59 v592 = new v59(2, this.X, mxa.class, "onItemLongClick", "onItemLongClick(JLone/me/chats/picker/PickerEntity$Type;)Z", 0, 5);
        qxa2.A(pxa);
        vu5 vu5 = new vu5(v59, 23, pxa);
        View view = qxa2.a;
        tu0.K(view, 300, vu5);
        ((lk3) view).setOnLongClickListener(new ad2(v592, 5, pxa));
    }

    public final int l(int i) {
        int i2 = rxa.a;
        return rxa.a;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        lk3 lk3 = new lk3(viewGroup.getContext(), (AttributeSet) null);
        dec dec = new dec(lk3);
        int i2 = this.Y;
        if (i2 > 0) {
            lk3.setPaddingRelative(tu0.G(((float) i2) * fk4.d().getDisplayMetrics().density), lk3.getPaddingTop(), lk3.getPaddingEnd(), lk3.getPaddingBottom());
        }
        return dec;
    }
}
