package defpackage;

import java.io.Serializable;
import ru.ok.messages.contacts.profile.ActContactAvatars;

/* renamed from: t5  reason: default package */
public final /* synthetic */ class t5 implements f6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ t5(dq0 dq0, long j, eq0 eq0) {
        this.c = dq0;
        this.b = j;
        this.d = eq0;
    }

    public final void run() {
        long j = this.b;
        Serializable serializable = this.d;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                int i = ActContactAvatars.h1;
                String str = (String) serializable;
                ((el3) ((y8a) ((ed3) ((ActContactAvatars) obj).K0.b)).getAccessor().c(el3.class)).d(j, str, str);
                return;
            default:
                dq0 dq0 = (dq0) obj;
                dq0.getClass();
                eq0 eq0 = (eq0) serializable;
                boolean D = nd7.D(eq0.a);
                zi5 zi5 = dq0.a;
                if (D) {
                    try {
                        ((kk5) zi5).e(j).delete();
                        return;
                    } catch (Exception unused) {
                        hm9.m("dq0", "deleteBotCommandsForChat: exception when delete botCommands for, chatId = %d", Long.valueOf(j));
                        return;
                    }
                } else if (!pag.K(((kk5) zi5).e(j), eq0)) {
                    hm9.m("dq0", "Failed to store botCommands, chatId = %d", Long.valueOf(j));
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ t5(ActContactAvatars actContactAvatars, String str, long j) {
        this.c = actContactAvatars;
        this.d = str;
        this.b = j;
    }
}
