package defpackage;

import android.os.Bundle;
import one.me.chatscreen.ChatScreen;

/* renamed from: in2  reason: default package */
public final /* synthetic */ class in2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp2 b;

    public /* synthetic */ in2(fp2 fp2, int i) {
        this.a = i;
        this.b = fp2;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        fp2 fp2 = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatScreen.k1;
                vo2.c.Z1(fp2.a, false);
                return e5f;
            case 1:
                bc7[] bc7Arr2 = ChatScreen.k1;
                vo2.c.P1().b(":call-join-link?link=".concat(fp2.c), (Bundle) null);
                return e5f;
            default:
                bc7[] bc7Arr3 = ChatScreen.k1;
                vo2.c.P1().b(zr6.k(new StringBuilder(":call-chat?chat_id="), fp2.b, "&video_enabled=false"), (Bundle) null);
                return e5f;
        }
    }
}
