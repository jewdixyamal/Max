package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wg6  reason: default package */
public final class wg6 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((wg6) n((uj3[]) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, wg6] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        uj3[] uj3Arr = (uj3[]) this.X;
        int length = uj3Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (!(true ^ i24.r(uj3Arr[i]))) {
                break;
            } else {
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
