package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: b5  reason: default package */
public final class b5 {
    public static final /* synthetic */ int c = 0;
    public final z4 a;
    public final khe b;

    public b5(Context context, z4 z4Var) {
        this.a = z4Var;
        this.b = new khe(new a5(context, 0));
    }

    public final Account a() {
        Object obj;
        try {
            obj = (Account) ys.f0(0, ((AccountManager) this.b.getValue()).getAccountsByType(this.a.a));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = null;
        }
        return (Account) obj;
    }

    public final void b() {
        hm9.m("b5", "removeAccount start", new Object[0]);
        Account a2 = a();
        if (a2 != null) {
            try {
                ((AccountManager) this.b.getValue()).removeAccountExplicitly(a2);
            } catch (Throwable th) {
                hm9.p("b5", "removeAccountExplicitly failed!", th);
            }
        }
        hm9.m("b5", "removeAccount finished!", new Object[0]);
    }
}
