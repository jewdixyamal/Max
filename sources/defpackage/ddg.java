package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.a;
import org.apache.http.HttpStatus;

/* renamed from: ddg  reason: default package */
public final class ddg extends z04 {
    public final /* synthetic */ int e;

    public /* synthetic */ ddg(int i) {
        this.e = i;
    }

    public ok e(Context context, Looper looper, kad kad, Object obj, ge6 ge6, he6 he6) {
        switch (this.e) {
            case 0:
                jod jod = (jod) obj;
                kad.getClass();
                Integer num = (Integer) kad.Z;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Account) kad.a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new iod(context, looper, kad, bundle, ge6, he6);
            case 1:
                au1.r(obj);
                throw null;
            case 3:
                return new a(context, looper, 126, kad, ge6, he6);
            case 5:
                return new xjg(context, looper, kad, (v70) obj, ge6, he6);
            case 6:
                return new big(context, looper, kad, (GoogleSignInOptions) obj, ge6, he6);
            default:
                return super.e(context, looper, kad, obj, ge6, he6);
        }
    }

    public ok f(Context context, Looper looper, kad kad, Object obj, ge6 ge6, he6 he6) {
        switch (this.e) {
            case 2:
                return new seg(context, looper, kad, (ooe) obj, ge6, he6);
            case 4:
                mk mkVar = (mk) obj;
                return new bhg(context, looper, kad, ge6, he6);
            case 7:
                mk mkVar2 = (mk) obj;
                return new a(context, looper, HttpStatus.SC_MULTIPLE_CHOICES, kad, ge6, he6);
            default:
                return super.f(context, looper, kad, obj, ge6, he6);
        }
    }
}
