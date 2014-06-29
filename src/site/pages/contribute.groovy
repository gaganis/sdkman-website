layout 'layouts/main.groovy',
        menu: menu,
        pageTitle: 'The Groovy programming language - Contribute',
        contents: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            ul(class: 'nav-sidebar') {
                                li(class: 'active') {
                                    a(href: 'contribute.html') { strong('Contribute') }
                                }
                            }
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            h1 'Contribute'
                            article {

                            }
                            hr(class: 'divider')
                        }
                    }
                }
            }
        }