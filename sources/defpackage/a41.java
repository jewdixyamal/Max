package defpackage;

import org.json.JSONObject;

/* renamed from: a41  reason: default package */
public final class a41 {
    public final ds1 a;
    public final je7 b;
    public final je7 c;

    public a41(ds1 ds1, je7 je7, je7 je72) {
        this.a = ds1;
        this.b = je7;
        this.c = je72;
    }

    public final z31 a(zm1 zm1, lyd lyd, lr1 lr1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        lyd lyd2 = lyd;
        jSONObject.put("is_video", lyd2.b);
        zm1 zm12 = zm1;
        return new z31(ds1.a(this.a).call(new x31(zm1, jSONObject, c2, lyd2, this, lr1, fVar)), zm1, true, false);
    }

    public final z31 b(xm1 xm1, lyd lyd, lr1 lr1, f fVar) {
        long c2 = c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", xm1.d);
        lyd lyd2 = lyd;
        jSONObject.put("is_video", lyd2.b);
        return new z31(ds1.a(this.a).createConfRoom(new w31(jSONObject, c2, lyd2, this, lr1, fVar, 0)), xm1, true, false);
    }

    public final long c() {
        return ((hyc) ((q33) ((so1) this.c.getValue()).a.getValue())).t();
    }

    public final z31 d(String str, boolean z, lyd lyd, lr1 lr1, f fVar) {
        String str2 = str;
        return new z31(ds1.a(this.a).joinByLink(new w31(str, c(), lyd, this, lr1, fVar, 1)), new ym1(str, z), !z, false);
    }
}
