package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.Objects;

/* renamed from: je  reason: default package */
public final class je extends rd7 implements k56 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent o;
    public final /* synthetic */ Bundle s0;
    public final /* synthetic */ Object t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle, int i5) {
        super(0);
        this.a = i5;
        this.t0 = obj;
        this.b = intentSender;
        this.c = i;
        this.o = intent;
        this.X = i2;
        this.Y = i3;
        this.Z = i4;
        this.s0 = bundle;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.t0;
                if (androidXLifecycleHandlerImpl.G0 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                    IntentSender intentSender = this.b;
                    Intent intent = this.o;
                    Bundle bundle = this.s0;
                    if (isLoggable) {
                        androidXLifecycleHandlerImpl.toString();
                        Objects.toString(intentSender);
                        Objects.toString(intent);
                        Objects.toString(bundle);
                    }
                    c f0 = androidXLifecycleHandlerImpl.f0();
                    pl8 pl8 = f0.D;
                    int i = this.c;
                    int i2 = this.X;
                    int i3 = this.Y;
                    if (pl8 != null) {
                        if (bundle != null) {
                            if (intent == null) {
                                intent = new Intent();
                                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                            }
                            if (Log.isLoggable("FragmentManager", 2)) {
                                bundle.toString();
                                intent.toString();
                                Objects.toString(androidXLifecycleHandlerImpl);
                            }
                            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                        }
                        n37 n37 = new n37(intentSender, intent, i2, i3);
                        f0.F.addLast(new i16(androidXLifecycleHandlerImpl.Y, i));
                        if (Log.isLoggable("FragmentManager", 2)) {
                            androidXLifecycleHandlerImpl.toString();
                        }
                        f0.D.C(n37);
                    } else {
                        z06 z06 = f0.w;
                        if (i == -1) {
                            Activity activity = z06.t0;
                            if (activity != null) {
                                activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.Z, bundle);
                            } else {
                                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                            }
                        } else {
                            z06.getClass();
                            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                        }
                    }
                    return e5f.a;
                }
                throw new IllegalStateException("Fragment " + androidXLifecycleHandlerImpl + " not attached to Activity");
            default:
                ((w2b) this.t0).startIntentSenderForResult(this.b, this.c, this.o, this.X, this.Y, this.Z, this.s0);
                return e5f.a;
        }
    }
}
