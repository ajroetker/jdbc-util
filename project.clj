(def ks-version "1.0.0")

(defproject puppetlabs/jdbc-util "0.1.5-SNAPSHOT"
  :description "Common JDBC helpers for use in Puppet Labs projects"
  :url "https://github.com/puppetlabs/jdbc-util"

  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}

  :pedantic :abort
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [org.postgresql/postgresql "9.3-1100-jdbc41"]
                 [com.zaxxer/HikariCP-java6 "2.3.9"]
                 [puppetlabs/kitchensink ~ks-version]]

  :plugins [[lein-release "1.0.5"]]

  :lein-release {:scm :git
                 :deploy-via :lein-deploy}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]])
