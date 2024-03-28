theme: /
    
    state: InitialMessage
        a: {{answers["a01.001ru"]}}

    state: ChangePassword1
        q!: ( * [логин*] [парол*] * приложен* | (1/1./один))
        a: {{answers["a01.002ru.01"]}}
        script: $reactions.timeout({ interval: "2 seconds", targetState: "ChangePassword2" });
            
        state: ChangePassword2
            a: {{answers["a01.002ru.02"]}}
            script: $reactions.timeout({ interval: "2 seconds", targetState: "/Goodbye" });

    state: ChangePIN
        q!: ( * [пин*] [pin*] [*код*] * карт* | (2/2./два))
        a: {{answers["a01.003ru.01"]}}
        a: {{answers["a01.003ru.02"]}}
        go!: /Goodbye
