package com.google.android.gms.auth.api.signin.internal;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends b {
    public static boolean O0 = false;
    public boolean J0 = false;
    public SignInConfiguration K0;
    public boolean L0;
    public int M0;
    public Intent N0;

    public final void V(int i) {
        Status status = new Status(i, (String) null, (PendingIntent) null, (ph3) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        O0 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.J0) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                        bkg y = bkg.y(this);
                        GoogleSignInOptions googleSignInOptions = this.K0.b;
                        synchronized (y) {
                            ((l8e) y.b).d(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.L0 = true;
                        this.M0 = i2;
                        this.N0 = intent;
                        new androidx.loader.app.b(this, w()).b(new wmc(this, false));
                        O0 = false;
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        V(intExtra);
                        return;
                    }
                }
                V(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            V(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.K0 = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.L0 = z;
                if (z) {
                    this.M0 = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.N0 = intent2;
                    new androidx.loader.app.b(this, w()).b(new wmc(this, false));
                    O0 = false;
                }
            } else if (O0) {
                setResult(0);
                V(12502);
            } else {
                O0 = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.K0);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.J0 = true;
                    V(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            }
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.L0);
        if (this.L0) {
            bundle.putInt("signInResultCode", this.M0);
            bundle.putParcelable("signInResultData", this.N0);
        }
    }
}
