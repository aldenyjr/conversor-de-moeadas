package br.com.alura.conversormoedas.util;

import java.util.logging.*;

public class Log {
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public Logger gerarLog(){
        logger.setUseParentHandlers(false);

        try {
            FileHandler handler = new FileHandler("logs.log", true);
            handler.setFormatter(new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getMessage() + "\n";
                }
            });
            logger.addHandler(handler);
            return logger;
        } catch (Exception e){
            System.out.println("Falha ao gerar LOG: " + e.getMessage());
        }

        return null;
    }

}
