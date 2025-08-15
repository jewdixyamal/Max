package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new ufg(22);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        fp3.j(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.b;
            GoogleSignInOptions googleSignInOptions2 = this.b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1 * 31;
        int i2 = 0;
        String str = this.a;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.b;
        if (googleSignInOptions != null) {
            i2 = googleSignInOptions.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.Q(parcel, 2, this.a);
        ay7.P(parcel, 5, this.b, i);
        ay7.W(parcel, T);
    }
}
