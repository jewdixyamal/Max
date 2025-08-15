package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import org.apache.http.protocol.HTTP;

/* renamed from: jr3  reason: default package */
public final /* synthetic */ class jr3 implements a8 {
    public final /* synthetic */ lr3 a;

    public /* synthetic */ jr3(lr3 lr3) {
        this.a = lr3;
    }

    public final void a(znc znc) {
        lr3 lr3 = this.a;
        try {
            Activity F = ay7.F(znc);
            die die = new die((Context) F, 13);
            String string = ((qyc) ((y7d) lr3.b.getValue())).g.getString("invite-header", (String) null);
            if (string == null) {
                string = F.getString(dpc.v);
            }
            die.c = string;
            ((Intent) die.b).setType(HTTP.PLAIN_TEXT_TYPE);
            qyc qyc = (qyc) ((y7d) lr3.b.getValue());
            String string2 = qyc.g.getString("invite-long", (String) null);
            if (string2 == null) {
                string2 = String.format(F.getString(dpc.C), Arrays.copyOf(new Object[]{qyc.p()}, 1));
            }
            die.R(string2);
            die.S();
        } catch (ActivityNotFoundException unused) {
            hm9.p("ContactsDeepLinkFactory", "shareInvite: failed, no activity found", (Throwable) null);
        }
    }
}
