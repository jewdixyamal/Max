package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* renamed from: occ  reason: default package */
public final /* synthetic */ class occ implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ occ(Object obj, k56 k56, int i) {
        this.a = i;
        this.c = obj;
        this.b = k56;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                RecordManagerImpl.stopRecord$lambda$2((RecordManager.StopParams) this.c, this.b, jSONObject);
                return;
            default:
                RecordManagerImpl.startRecord$lambda$0((RecordManager.StartParams) this.c, this.b, jSONObject);
                return;
        }
    }
}
