package defpackage;

import java.util.Map;

/* renamed from: ma7  reason: default package */
public final /* synthetic */ class ma7 implements my9 {
    public final /* synthetic */ int a;

    public /* synthetic */ ma7(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ny9 ny9 = (ny9) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ny9 ny92 = (ny9) obj2;
                ny92.a(qob.g, entry.getKey());
                ny92.a(qob.h, entry.getValue());
                return;
            default:
                ny9 ny93 = (ny9) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
