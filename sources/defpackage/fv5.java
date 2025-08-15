package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: fv5  reason: default package */
public final class fv5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ TextView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextView textView = (TextView) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                fv5 fv5 = new fv5(3, continuation, 0);
                fv5.Y = textView;
                e5f e5f = e5f.a;
                fv5.o(e5f);
                return e5f;
            case 1:
                fv5 fv52 = new fv5(3, continuation, 1);
                fv52.Y = textView;
                e5f e5f2 = e5f.a;
                fv52.o(e5f2);
                return e5f2;
            default:
                fv5 fv53 = new fv5(3, continuation, 2);
                fv53.Y = textView;
                e5f e5f3 = e5f.a;
                fv53.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                TextView textView = this.Y;
                pq9 pq9 = qp4.u0;
                textView.setTextColor(pq9.j(textView).getText().e);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.j(textView).d().a.a.h), (Drawable) null, new ColorDrawable(-1)));
                return e5f.a;
            case 1:
                od2.a0(obj);
                TextView textView2 = this.Y;
                textView2.setTextColor(qp4.u0.j(textView2).getText().e);
                return e5f.a;
            default:
                od2.a0(obj);
                TextView textView3 = this.Y;
                textView3.setTextColor(qp4.u0.j(textView3).getText().g);
                return e5f.a;
        }
    }
}
