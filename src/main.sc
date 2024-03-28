require: import.sc


theme: /

    state: Start
        q!: $regexp</start>
        a: Здравствуйте!
        go!: /InitialMessage
        
    state: Hello
        q!: (привет* | здравствуй* | добр* (ден*/утр*/веч*/ноч*))
        a: Здравствуйте!

    state: CatchAll
        q!: *
        a: Боюсь, я вас не понял. Пожалуйста, попробуйте задать вопрос ещё раз.
        go!: /InitialMessage
        
    state: Goodbye
        a: Приятно было пообщаться. Рад буду помочь вам снова!
        EndSession:
