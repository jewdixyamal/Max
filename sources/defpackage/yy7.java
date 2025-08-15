package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: yy7  reason: default package */
public final class yy7 {
    public e52 a;
    public int b;
    public cu8 c;
    public MessageModel d;
    public u6b e;
    public List f = nz4.a;

    public final zy7 a(m56 m56) {
        m56.invoke(this);
        e52 e52 = this.a;
        if (e52 != null) {
            int i = this.b;
            u6b u6b = this.e;
            if (u6b != null) {
                zy7 zy7 = new zy7(e52, u6b, i);
                cu8 cu8 = this.c;
                if (cu8 != null) {
                    bc7 bc7 = zy7.h[0];
                    zy7.d.b = cu8;
                }
                MessageModel messageModel = this.d;
                if (messageModel != null) {
                    bc7 bc72 = zy7.h[1];
                    zy7.e.b = messageModel;
                }
                List list = this.f;
                bc7 bc73 = zy7.h[3];
                zy7.g.b = list;
                return zy7;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
