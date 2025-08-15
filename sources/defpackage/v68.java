package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* renamed from: v68  reason: default package */
public final class v68 extends MediaBrowserService {
    public final /* synthetic */ t68 a;
    public final /* synthetic */ u68 b;
    public final /* synthetic */ w68 c;

    public v68(w68 w68, Context context) {
        this.c = w68;
        this.b = w68;
        this.a = w68;
        attachBaseContext(context);
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        ph4 ph4;
        bi8.a(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        t68 t68 = this.a;
        cj8 cj8 = (cj8) t68.d;
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            t68.c = new Messenger(cj8.Z);
            bundle2 = zr6.g(2, "extra_service_version");
            bundle2.putBinder("extra_messenger", ((Messenger) t68.c).getBinder());
            ai8 ai8 = cj8.s0;
            if (ai8 != null) {
                pr6 a2 = ai8.a();
                bundle2.putBinder("extra_session_binder", a2 == null ? null : a2.asBinder());
            } else {
                ((ArrayList) t68.a).add(bundle2);
            }
            i2 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
        }
        s68 s68 = new s68((cj8) t68.d, str, i2, i, (c78) null);
        cj8.Y = s68;
        ph4 b2 = cj8.b(bundle3);
        cj8.Y = null;
        if (b2 == null) {
            ph4 = null;
        } else {
            if (((Messenger) t68.c) != null) {
                cj8.o.add(s68);
            }
            Bundle bundle4 = (Bundle) b2.b;
            if (bundle2 == null) {
                bundle2 = bundle4;
            } else if (bundle4 != null) {
                bundle2.putAll(bundle4);
            }
            ph4 = new ph4(bundle2);
        }
        if (ph4 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) ph4.a, (Bundle) ph4.b);
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        fd7 fd7 = new fd7(result);
        t68 t68 = this.a;
        t68.getClass();
        cj8 cj8 = (cj8) t68.d;
        cj8.Y = cj8.c;
        fd7.L((Object) null);
        cj8.Y = null;
    }

    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        fd7 fd7 = new fd7(result);
        cj8 cj8 = this.b.e;
        cj8.Y = cj8.c;
        fd7.L((Object) null);
        cj8.Y = null;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        bi8.a(bundle);
        w68 w68 = this.c;
        cj8 cj8 = w68.f;
        s68 s68 = cj8.c;
        fd7 fd7 = new fd7(result);
        cj8.Y = s68;
        fd7.L((Object) null);
        cj8.Y = null;
        w68.f.Y = null;
    }
}
