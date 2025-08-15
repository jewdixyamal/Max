package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pb1  reason: default package */
public final class pb1 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((pb1) n((uj3[]) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, pb1] */
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
            if (i < length) {
                uj3 uj3 = uj3Arr[i];
                if (uj3 == null || uj3.w()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
