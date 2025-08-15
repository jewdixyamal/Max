package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* renamed from: mb5  reason: default package */
public final class mb5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatTextView Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                mb5 mb5 = new mb5(this.Y, (Continuation) obj3);
                mb5.Z = (fka) obj2;
                e5f e5f = e5f.a;
                mb5.o(e5f);
                return e5f;
            case 1:
                mb5 mb52 = new mb5(3, (Continuation) obj3, 1);
                mb52.Y = (AppCompatTextView) obj;
                mb52.Z = (fka) obj2;
                e5f e5f2 = e5f.a;
                mb52.o(e5f2);
                return e5f2;
            case 2:
                mb5 mb53 = new mb5(3, (Continuation) obj3, 2);
                mb53.Y = (AppCompatTextView) obj;
                mb53.Z = (fka) obj2;
                e5f e5f3 = e5f.a;
                mb53.o(e5f3);
                return e5f3;
            case 3:
                mb5 mb54 = new mb5(3, (Continuation) obj3, 3);
                mb54.Y = (AppCompatTextView) obj;
                mb54.Z = (fka) obj2;
                e5f e5f4 = e5f.a;
                mb54.o(e5f4);
                return e5f4;
            case 4:
                mb5 mb55 = new mb5(3, (Continuation) obj3, 4);
                mb55.Y = (AppCompatTextView) obj;
                mb55.Z = (fka) obj2;
                e5f e5f5 = e5f.a;
                mb55.o(e5f5);
                return e5f5;
            default:
                mb5 mb56 = new mb5(3, (Continuation) obj3, 5);
                mb56.Y = (AppCompatTextView) obj;
                mb56.Z = (fka) obj2;
                e5f e5f6 = e5f.a;
                mb56.o(e5f6);
                return e5f6;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().e);
                return e5f.a;
            case 1:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().b);
                return e5f.a;
            case 2:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().e);
                return e5f.a;
            case 3:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().g);
                return e5f.a;
            case 4:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().h);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().j);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb5(AppCompatTextView appCompatTextView, Continuation continuation) {
        super(3, continuation);
        this.X = 0;
        this.Y = appCompatTextView;
    }
}
