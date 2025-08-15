package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: i9a  reason: default package */
public final /* synthetic */ class i9a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9a b;
    public final /* synthetic */ az7 c;

    public /* synthetic */ i9a(m9a m9a, zy7 zy7, int i) {
        this.a = i;
        this.b = m9a;
        this.c = zy7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                zy7 zy7 = (zy7) this.c;
                List c2 = zy7.c();
                int i = zy7.c;
                return Boolean.valueOf(this.b.c(zy7, (MessageModel) c2.get(i), (MessageModel) zy7.c().get(i - 1)));
            default:
                zy7 zy72 = (zy7) this.c;
                List c3 = zy72.c();
                int i2 = zy72.c;
                return Boolean.valueOf(this.b.c(zy72, (MessageModel) c3.get(i2), (MessageModel) zy72.c().get(i2 + 1)));
        }
    }
}
