package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;

/* renamed from: o80  reason: default package */
public final class o80 extends AbstractAccountAuthenticator {
    public final Context a;
    public final z4 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public o80(Context context, z4 z4Var, je7 je7, je7 je72, je7 je73) {
        super(context);
        this.a = context;
        this.b = z4Var;
        this.c = je7;
        this.d = je72;
        this.e = je73;
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (((b5) this.c.getValue()).a() != null) {
            this.b.getClass();
            bundle2.putInt("errorCode", 1029);
            bundle2.putString("errorMessage", this.a.getString(f1c.account_already_exists));
        }
        return bundle2;
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        hm9.m("o80", "getAccountRemovalAllowed", new Object[0]);
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        je7 je7 = this.d;
        if (((f5a) je7.getValue()).d() && accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            boolean e2 = ((f5a) je7.getValue()).e();
            int i = t8d.o;
            int i2 = ft4.o;
            t8d.c = z7.S(System.nanoTime(), kt4.NANOSECONDS);
            ((s8g) this.e.getValue()).a(new t8d(e2));
        }
        return accountRemovalAllowed;
    }

    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        ((b5) this.c.getValue()).getClass();
        return new Bundle();
    }

    public final String getAuthTokenLabel(String str) {
        return null;
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }
}
