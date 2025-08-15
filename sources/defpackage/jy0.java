package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;

/* renamed from: jy0  reason: default package */
public final /* synthetic */ class jy0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                a4c a4c = (a4c) ((i50) this.b).X;
                if (jSONObject == null || !"command-discarded".equals(jSONObject.optString("error"))) {
                    a4c.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
                    return;
                }
                a4c.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
                return;
            default:
                MediaDumpManagerImpl.requestMediaDump$lambda$0((MediaDumpManager.RemoteMediaDumpRequestListener) this.b, jSONObject);
                return;
        }
    }
}
