package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: zy7  reason: default package */
public final class zy7 implements az7, bz7 {
    public static final /* synthetic */ bc7[] h;
    public final e52 a;
    public final u6b b;
    public final int c;
    public final hz1 d = new hz1(1);
    public final hz1 e = new hz1(1);
    public final hz1 f = new hz1(1);
    public final hz1 g = new hz1(1);

    static {
        Class<zy7> cls = zy7.class;
        h = new bc7[]{new oi9(cls, "messageDb", "getMessageDb()Lru/ok/tamtam/messages/MessageDb;"), rh4.g(nec.a, cls, "messageModel", "getMessageModel()Lone/me/messages/list/loader/MessageModel;"), new oi9(cls, "senderContact", "getSenderContact()Lru/ok/tamtam/contacts/Contact;"), new oi9(cls, "messageModels", "getMessageModels()Ljava/util/List;")};
    }

    public zy7(e52 e52, u6b u6b, int i) {
        this.a = e52;
        this.b = u6b;
        this.c = i;
    }

    public final cu8 a() {
        return (cu8) this.d.T0(this, h[0]);
    }

    public final MessageModel b() {
        return (MessageModel) this.e.T0(this, h[1]);
    }

    public final List c() {
        return (List) this.g.T0(this, h[3]);
    }

    public final uj3 d() {
        return (uj3) this.f.T0(this, h[2]);
    }
}
