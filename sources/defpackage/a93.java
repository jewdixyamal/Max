package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.coroutines.Continuation;

/* renamed from: a93  reason: default package */
public final class a93 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ lk3 Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a93(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lk3 lk3 = (lk3) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a93 a93 = new a93(3, continuation, 0);
                a93.Y = lk3;
                a93.Z = fka;
                e5f e5f = e5f.a;
                a93.o(e5f);
                return e5f;
            default:
                a93 a932 = new a93(3, continuation, 1);
                a932.Y = lk3;
                a932.Z = fka;
                e5f e5f2 = e5f.a;
                a932.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                lk3 lk3 = this.Y;
                ne0 b = this.Z.b();
                lk3.setBackground(new RippleDrawable(ColorStateList.valueOf(b.k), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
            default:
                od2.a0(obj);
                lk3 lk32 = this.Y;
                ne0 b2 = this.Z.b();
                lk32.setBackground(new RippleDrawable(ColorStateList.valueOf(b2.k), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
        }
    }
}
