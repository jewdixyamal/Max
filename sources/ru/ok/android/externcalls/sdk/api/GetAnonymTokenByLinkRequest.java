package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

public class GetAnonymTokenByLinkRequest extends b0 implements yk {
    private static final za7 PARSER = new ig5(19);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.a == 457;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(db7 db7) throws IOException, JsonParseException {
        db7.s();
        String str = null;
        String str2 = null;
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            if (T.equals("uid")) {
                str = db7.H();
            } else if (!T.equals(ApiProtocol.KEY_TOKEN)) {
                db7.z();
            } else {
                str2 = db7.H();
            }
        }
        db7.q();
        return new Response(str, str2);
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    public /* bridge */ /* synthetic */ za7 getFailParser() {
        return nd2.b;
    }

    public za7 getOkParser() {
        return PARSER;
    }

    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    public /* bridge */ /* synthetic */ kl getScope() {
        return kl.o;
    }

    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    public Uri getUri() {
        return sl.a("vchat.getAnonymTokenByLink");
    }

    public void populateParams(el elVar) {
        elVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        elVar.b("anonymName", this.name);
    }

    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, (String) null);
    }
}
