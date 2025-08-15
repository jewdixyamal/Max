package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: i89  reason: default package */
public final class i89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ MessageModel Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i89(l89 l89, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.Y = l89;
        this.Z = messageModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i89(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            MessageModel messageModel = this.Z;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "On unreadScrollButton clicked, current messageModel=".concat(messageModel.m()), (Throwable) null);
            }
            e52 e52 = (e52) this.Y.d.getValue();
            if (e52 == null) {
                return e5f;
            }
            long n = e52.n();
            es8 es8 = e52.c;
            long k = es8 != null ? es8.k() : 0;
            if (n >= k || this.Z.c >= n) {
                String str2 = this.Y.i;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us7 = us7.X;
                    StringBuilder k2 = au1.k(n, "onUnreadScrollButtonClicked: selfReadMark=", " >= lastMessageTime=");
                    k2.append(k);
                    ir62.d(us7, str2, k2.toString(), (Throwable) null);
                }
                l89 l89 = this.Y;
                this.X = 1;
                l89.d(l89, k, 0, true, 0, 10);
                if (e5f == tx3) {
                    return tx3;
                }
            } else {
                l29 l29 = (l29) this.Y.e.getValue();
                List list = l29.a;
                int f = l29.f(n);
                if (f < 0) {
                    f = Math.abs(f) - 1;
                }
                MessageModel messageModel2 = (MessageModel) x53.j0(f, list);
                if (messageModel2 == null) {
                    String str3 = this.Y.i;
                    ir6 ir63 = hm9.m;
                    if (ir63 != null && ir63.c()) {
                        ir63.d(us7.X, str3, "onUnreadScrollButtonClicked: message with ts=selfReadMark is not loaded, load around it", (Throwable) null);
                    }
                    this.Y.l.updateAndGet(new v79(n, 2));
                    this.Y.g.invoke(new Long(n));
                } else if (messageModel2.c == this.Z.c) {
                    String str4 = this.Y.i;
                    ir6 ir64 = hm9.m;
                    if (ir64 != null && ir64.c()) {
                        us7 us72 = us7.X;
                        ir64.d(us72, str4, x9e.c0("onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded and is last on screen, \n                            |scroll to lastMessageTime=" + k), (Throwable) null);
                    }
                    l89 l892 = this.Y;
                    this.X = 2;
                    l89.d(l892, k, 0, false, 0, 14);
                    if (e5f == tx3) {
                        return tx3;
                    }
                } else {
                    String str5 = this.Y.i;
                    ir6 ir65 = hm9.m;
                    if (ir65 != null && ir65.c()) {
                        ir65.d(us7.X, str5, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded, scroll to it", (Throwable) null);
                    }
                    this.Y.l.updateAndGet(new oe2(8));
                    wwc.j(this.Y.o, messageModel2.c, false, 6);
                }
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
