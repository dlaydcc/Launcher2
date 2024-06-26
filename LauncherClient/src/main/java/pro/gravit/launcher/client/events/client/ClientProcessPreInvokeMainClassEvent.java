package pro.gravit.launcher.client.events.client;

import pro.gravit.launcher.client.ClientParams;
import pro.gravit.launcher.modules.LauncherModule;
import pro.gravit.launcher.profiles.ClientProfile;

import java.util.Collection;

public class ClientProcessPreInvokeMainClassEvent extends LauncherModule.Event {
    public final ClientParams params;
    public final ClientProfile profile;
    public final Collection<String> args;

    public ClientProcessPreInvokeMainClassEvent(ClientParams params, ClientProfile profile, Collection<String> args) {
        this.params = params;
        this.profile = profile;
        this.args = args;
    }
}
