package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kvf  reason: default package */
public final class kvf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ avf Z;
    public final /* synthetic */ vvf s0;
    public final /* synthetic */ evf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvf(avf avf, evf evf, vvf vvf, Continuation continuation) {
        super(2, continuation);
        this.Z = avf;
        this.s0 = vvf;
        this.t0 = evf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kvf) n((nn0) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vvf vvf = this.s0;
        kvf kvf = new kvf(this.Z, this.t0, vvf, continuation);
        kvf.Y = obj;
        return kvf;
    }

    public final Object o(Object obj) {
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        evf evf = this.t0;
        vvf vvf = this.s0;
        if (i == 0) {
            od2.a0(obj);
            nn0 nn0 = (nn0) this.Y;
            boolean z = nn0.a;
            avf avf = this.Z;
            if (z) {
                String str2 = avf.b;
                List list = vvf.i;
                String a = ((ti4) vvf.d.getValue()).a();
                dvf dvf = new dvf(str2, list, nn0.b, nn0.c, nn0.d, a);
                ja7 ja7 = vvf.a;
                ja7.getClass();
                str = ja7.b(dvf.Companion.serializer(), dvf);
            } else {
                ewf ewf = new ewf(avf.b);
                ja7 ja72 = vvf.a;
                ja72.getClass();
                str = ja72.b(ewf.Companion.serializer(), ewf);
            }
            zt0 zt0 = vvf.g;
            x97 x97 = new x97(evf.a, str);
            this.X = 1;
            if (zt0.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vvf.e(vvf, evf.a);
        return e5f.a;
    }
}
